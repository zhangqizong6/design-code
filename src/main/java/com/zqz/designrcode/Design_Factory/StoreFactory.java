package com.zqz.designrcode.Design_Factory;

import com.zqz.designrcode.Design_Factory.service.ICommodity;
import com.zqz.designrcode.Design_Factory.service.impl.CardCommodityService;
import com.zqz.designrcode.Design_Factory.service.impl.CouponCommodityService;
import com.zqz.designrcode.Design_Factory.service.impl.GoodsCommodityService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;



/**
 * @ClassName: storeFactory
 * @author: zqz
 * @date: 2023/10/7 16:52
 */
@Component
@Slf4j
public class StoreFactory {



    public ICommodity getCommodityService(Integer commodityType){
        if (null == commodityType) return null;
        if (1 == commodityType) return new CardCommodityService();
        if (2 == commodityType) return new CouponCommodityService();
        if (3 == commodityType) return new GoodsCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
