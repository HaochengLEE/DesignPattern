package com.pattern.structural.facade;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("积分支付成功");
        return true;
    }
}
