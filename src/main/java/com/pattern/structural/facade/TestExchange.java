package com.pattern.structural.facade;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class TestExchange {
    public static void main(String[] args) {
        PointsGift pointsGift=new PointsGift("PS5");

        GiftfxchangeService giftfxchangeService=new GiftfxchangeService();

        giftfxchangeService.giftExchange(pointsGift);
    }
}
