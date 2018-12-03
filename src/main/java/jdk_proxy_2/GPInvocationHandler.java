package jdk_proxy_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public interface GPInvocationHandler {
    public Object invoke(Object object, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException;
}
