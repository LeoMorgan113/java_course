package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


class MyProxy implements InvocationHandler {
    Complex ref = new ComplexNumForms();

    public MyProxy(Complex ref) {
        this.ref = ref;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if( method.getName().startsWith("get") ){
            return method.invoke(ref, args);
        }
        throw new IllegalAccessException("Not allowed");
    }
}
