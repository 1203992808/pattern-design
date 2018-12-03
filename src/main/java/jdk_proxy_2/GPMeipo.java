package jdk_proxy_2;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GPMeipo implements GPInvocationHandler {
    private Person person;
    public Object getInstance (Person person) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        this.person = person;
        Class clazz = person.getClass();
        return GPProxy.getProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object object, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("我是媒婆，现在开始：");
        method.invoke(person,args);
        System.out.println("结束");


        return null;
    }
}
