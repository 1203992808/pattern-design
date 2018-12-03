package jdK_proxy_test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Meipo implements InvocationHandler {
    private Person  person;
    public Object getInstance (Person person) throws  Throwable{
         this.person = person;
         Class clazz = person.getClass();
        System.out.println(clazz);
         return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，现在开始让我的顾客自我介绍： ");
        method.invoke(this.person,args);
        System.out.println("我的顾客自我介绍结束，下面开始下一个环节");
        return null;
    }
}
