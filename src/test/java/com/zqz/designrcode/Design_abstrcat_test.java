package com.zqz.designrcode;

import com.zqz.designrcode.Design_abstract.Adapter.impl.EGMCacheAdapter;
import com.zqz.designrcode.Design_abstract.Adapter.impl.IIRCacheAdapter;
import com.zqz.designrcode.Design_abstract.proxy.JDKProxy;
import com.zqz.designrcode.Design_abstract.service.CacheService;
import com.zqz.designrcode.Design_abstract.service.CacheServiceImpl;
import org.junit.jupiter.api.Test;

/**
 * @ClassName: Design_abstrcat_test
 * @author: zqz
 * @date: 2023/10/8 16:19
 */

public class Design_abstrcat_test {

    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01","小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println(val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01","小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println(val02);
    }
}
