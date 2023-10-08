package com.zqz.designrcode.Design_abstract.Adapter.impl;

import com.zqz.designrcode.Design_abstract.Adapter.ICacheAdapter;
import com.zqz.designrcode.Design_abstract.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: IIRCacheAdapter
 * @author: zqz
 * @date: 2023/10/8 15:48
 */

public class IIRCacheAdapter implements ICacheAdapter {
    private IIR iir = new IIR();

    @Override
    public String get(String key) {
        return iir.get(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {

    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
