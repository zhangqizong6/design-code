package com.zqz.designrcode.Design_abstract.proxy;

import com.zqz.designrcode.Design_abstract.Adapter.ICacheAdapter;
import com.zqz.designrcode.Design_abstract.utils.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName: JDKInvocationHandler
 * @author: zqz
 * @date: 2023/10/8 15:54
 */

public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter,args);

    }
}
