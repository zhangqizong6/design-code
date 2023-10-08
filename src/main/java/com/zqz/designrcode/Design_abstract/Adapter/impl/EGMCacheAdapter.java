package com.zqz.designrcode.Design_abstract.Adapter.impl;

import com.zqz.designrcode.Design_abstract.Adapter.ICacheAdapter;
import com.zqz.designrcode.Design_abstract.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: EGMCacheAdapter
 * @author: zqz
 * @date: 2023/10/8 15:48
 */

public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.get(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {

    }

    @Override
    public void del(String key) {
        egm.del(key);
    }
}
