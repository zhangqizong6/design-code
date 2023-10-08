package com.zqz.designrcode.Design_Factory.service;

import java.util.Map;

public interface ICommodity {

    /**
     *
     * @param uid 用户id
     * @param commodityId 奖品id
     * @param bizId 业务id
     * @param extMap 扩充字段
     * @throws Exception
     */
    void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
