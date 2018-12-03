package jdk_proxy_2;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GPProxy {
    private static final String ln = "\r\n";
    public static Object getProxyInstance(GPClassLoader classLoader, Class<?>[] interfaces,GPInvocationHandler h) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.产生源码
       String src =  generateSrc(interfaces[0]);

        //2.将源代码保存到磁盘，生成java文件
        String path = GPProxy.class.getResource("").getPath();
        File file = new File(path+"$Proxy0.java");
        FileWriter fw = new FileWriter(file);
        fw.write(src);
        fw.flush();
        fw.close();
        //3.编译源代码，生成class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
        Iterable iterable = manager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
        task.call();
        manager.close();
        //4.将class文件中的内容，动态加载到jvm中

        //5.返回被代理的类
        Class clazz = classLoader.findClass("$Proxy0");
        Constructor constructor = clazz.getConstructor(GPInvocationHandler.class);
        return constructor.newInstance(h);
    }
    private static String generateSrc (Class<?> interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package jdk_proxy_2;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("public class $Proxy0 implements  "+interfaces.getName()+" {"+ln);
        sb.append("GPInvocationHandler h;"+ln);
        sb.append("public $Proxy0 (GPInvocationHandler h) {"+ln );
        sb.append("this.h = h;"+ln);
        sb.append("}"+ln);
        for (Method method: interfaces.getMethods()) {
            sb.append("public "+ method.getReturnType().getName()+" "+method.getName()+" (){"+ln);
            sb.append("try {"+ln);
            sb.append("Method m = "+interfaces.getName()+".class.getMethod(\""+method.getName()+"\",new Class[]{});"+ln );
            sb.append("this.h.invoke(this,m,null);"+ln);
            sb.append("}catch(Throwable e){"+ln);
            sb.append("e.printStackTrace();}"+ln);
            sb.append("}"+ln);
        }

        sb.append("}"+ln);
        return sb.toString();
    }
}
