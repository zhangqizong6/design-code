package com.zqz.designrcode.Design_abstract;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName: IIR
 * @author: zqz
 * @date: 2023/10/8 14:20
 */

/**
 * 模拟集群IIR
 */
@Slf4j
public class EGM {

   private Map<String,String> dataMap = new ConcurrentHashMap<>();

   public String get(String key){
       log.info("获取key为{}的值",key);
       return dataMap.get(key);
   }

   public void set(String key,String value){
       log.info("填充key为{}的值{}value",key,value);
       dataMap.put(key,value);
   }

   public void del(String key){
       log.info("删除key为{}的值",key);
       dataMap.remove(key);
   }


}
