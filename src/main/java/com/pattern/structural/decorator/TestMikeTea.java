package com.pattern.structural.decorator;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class TestMikeTea {
    public static void main(String[] args) {
        AMikeTea aMikeTea;
        aMikeTea=new MikeTea();
        aMikeTea=new CheeseDecorator(aMikeTea);
        aMikeTea=new BatteryDecorator(aMikeTea);

        System.out.println(aMikeTea.getName()+"一共"+aMikeTea.getPrice()+"元");
    }
}
