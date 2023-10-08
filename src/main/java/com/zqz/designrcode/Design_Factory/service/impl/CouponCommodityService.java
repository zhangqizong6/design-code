package com.zqz.designrcode.Design_Factory.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zqz.designrcode.Design_Factory.service.ICommodity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @ClassName: CouponCommodityService
 * @author: zqz
 * @date: 2023/10/7 16:31
 */
@Service
@Slf4j
public class CouponCommodityService implements ICommodity {

    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {


        log.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uid, commodityId, bizId, JSONObject.toJSONString(extMap));
        log.info("测试结果[优惠券]：{}", "youhuijuan");


    }

}
