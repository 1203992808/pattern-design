package jdk_proxy;

import java.lang.reflect.Method;

public interface GPInvcotationHandler {
    public Object invoke(Object object, Method method, Object[] args) throws Throwable;

}
