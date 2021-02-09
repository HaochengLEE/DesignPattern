package com.pattern.structural.facade;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class GiftfxchangeService {
    private QualifyService qualifyService=new QualifyService();
    private PointsPaymentService pointsPaymentService=new PointsPaymentService();
    private LogisticsService logisticsService=new LogisticsService();

    public void giftExchange(PointsGift pointsGift){
        //资格校验通过
        if(qualifyService.isAvailable(pointsGift)){
            //支付积分成功
            if (pointsPaymentService.pay(pointsGift)){
                //发送物流信息
                String shippingOrderNum=logisticsService.orderNum(pointsGift);
                System.out.println("物流发送成功，订单号是"+shippingOrderNum);

            }
        }
    }
}
