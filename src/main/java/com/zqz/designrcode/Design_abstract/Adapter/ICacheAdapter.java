package com.zqz.designrcode.Design_abstract.Adapter;

import java.util.concurrent.TimeUnit;

public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
