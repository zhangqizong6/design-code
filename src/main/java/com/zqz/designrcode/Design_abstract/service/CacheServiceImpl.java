package com.zqz.designrcode.Design_abstract.service;

import com.zqz.designrcode.Design_abstract.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: CacheServiceImpl
 * @author: zqz
 * @date: 2023/10/8 16:21
 */

public class CacheServiceImpl implements CacheService{
    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
