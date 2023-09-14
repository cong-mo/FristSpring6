package com.slm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    private Object getProxy(){
        ClassLoader classLoader=target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                Object res = method.invoke(proxy, args);
                System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ res);
                return res;
            }
        };

        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
