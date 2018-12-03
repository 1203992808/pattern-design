package jdK_proxy_test;

import sun.misc.ProxyGenerator;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) {
      try {
          Lutt lutt = new Lutt();
          lutt.setName("lutt");
          lutt.setAge(24);
          lutt.setRequirements("高富帅，有房有车");
          Person person = (Person)new Meipo().getInstance(lutt);
          System.out.println(person.getClass());
          person.findLove();
          String path = Test.class.getResource("").getPath();
          System.out.println(path);

          byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
          FileOutputStream out = new FileOutputStream("D:/tmp/$Proxy0.class");
          out.write(data);
          out.close();

      }catch (Exception e) {
          e.printStackTrace();
      } catch (Throwable throwable) {
          throwable.printStackTrace();
      }
    }
}
