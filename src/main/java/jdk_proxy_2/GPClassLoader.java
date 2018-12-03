package jdk_proxy_2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GPClassLoader extends  ClassLoader {
    private File baseDir;
    public GPClassLoader(){
        String basePath = GPClassLoader.class.getResource("").getPath();
        baseDir = new File(basePath);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String  baseName = GPClassLoader.class.getPackage().getName()+"."+name;
        if (baseDir != null) {
            File classFile = new File(baseDir,name.replaceAll("\\.","/")+".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                ByteArrayOutputStream out = null;
                try{
                    in = new FileInputStream(classFile);
                    out = new ByteArrayOutputStream();
                    byte[] data = new byte[1024];
                    int len;
                    while ((len =in.read(data))!= -1) {
                        out.write(data,0,len);
                    }
                    return defineClass(baseName,out.toByteArray(),0,out.size());

                }catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    if (in != null) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return null;
    }
}
