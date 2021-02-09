package com.pattern.structural.facade;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class QualifyService {
    /**
     * 资格校验
     * @param pointsGift
     * @return
     */
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过，库存通过");
        return true;
    }


}
