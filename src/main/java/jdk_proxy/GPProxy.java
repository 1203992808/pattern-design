package jdk_proxy;

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
    private static String ln = "\r\n";
    public static Object newProxyInstance(GPClassLoader classLoader,Class<?>[] interfaces,GPInvcotationHandler h) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1. 生成源代码
        String proxySrc = generaticSrc(interfaces[0]);
        // 2.将生成的源代码输出到磁盘，保存到.java 文件
        String filePath = GPProxy.class.getResource("").getPath();
        File file = new File (filePath+"$Proxy0.java");
        FileWriter fw = new FileWriter(file);
        fw.write(proxySrc);
        fw.flush();
        fw.close();

        //3.编译源代码，并生成class文件
       try {
           JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
           StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
           Iterable iterable = manager.getJavaFileObjects(file);
           JavaCompiler.CompilationTask compilationTask = compiler.getTask(null,manager,null,null,null,iterable);
           compilationTask.call();
           manager.close();
       }catch (Exception e){
           e.printStackTrace();
       }
        //4.将class文件中的内容，动态加载到jvm中

        //5.返回被代理后的代理对象
        Class clazz = classLoader.findClass("$Proxy0");
        Constructor constructor = clazz.getConstructor(GPInvcotationHandler.class);
        return constructor.newInstance(h);

    }
    private static String generaticSrc (Class<?> interfaces) {
        StringBuilder sb = new StringBuilder();
        sb.append("package jdk_proxy;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("public class $Proxy0 implements " + interfaces.getName() +"{"+ln);
        sb.append("GPInvcotationHandler h;");
        sb.append("public $Proxy0(GPInvcotationHandler h) {"+ln);
        sb.append("this.h = h;");
        sb.append("}" + ln);
        for (Method method:interfaces.getMethods()) {
                sb.append("public  " + method.getReturnType().getName() + " "+ method.getName() +"()  { "+ln );
                sb.append("try {"+ln);
                sb.append("Method m = "+interfaces.getName() +".class.getMethod(\""+method.getName()+"\",new Class[]{});" );
                sb.append("this.h.invoke(this,m,null);");
                sb.append("}catch(Throwable e){" +ln);
                sb.append( " e.printStackTrace();}"+ln);
                sb.append("}"+ln);
        }

        sb.append("}"+ln);

        return sb.toString();

    }
}
