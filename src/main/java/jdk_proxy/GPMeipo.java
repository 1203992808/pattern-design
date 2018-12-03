package jdk_proxy;

import java.lang.reflect.Method;

public class GPMeipo implements GPInvcotationHandler {
    private Person person;
    public Object getInstance(Person person) throws  Exception{
        this.person = person;
        Class  clazz = person.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object object, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆，现在我的客人开始说她的要求");
        method.invoke(person,args);
        System.out.println("结束了,开始下一个流程");
        return null;
    }
}
