package com.zqz.designrcode.Design_abstract.proxy;

import com.zqz.designrcode.Design_abstract.Adapter.ICacheAdapter;

import java.lang.reflect.Proxy;

/**
 * @ClassName: JDKProxy
 * @author: zqz
 * @date: 2023/10/8 15:52
 */

public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {

        JDKInvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
    }

}
