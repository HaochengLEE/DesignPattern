package com.pattern.structural.facade;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class LogisticsService {
    public String orderNum(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"正在派送中");
        String shippingOrderNo="1024";
        return shippingOrderNo;

    }
}
