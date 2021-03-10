package com.pattern.structural.decorator.origin;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class TestMikeTea {
    public static void main(String[] args) {
        MikeTea mikeTea=new MikeTea();
        System.out.println(mikeTea.getName()+" 销售:"+mikeTea);

        MikeTea cheeseMikeTea=new CheeseMikeTea();
        System.out.println(cheeseMikeTea.getName()+" 销售:"+cheeseMikeTea);

        MikeTea batteryCheeseMikeTea=new BatteryCheeseMikeTea();
        System.out.println(batteryCheeseMikeTea.getName()+" 销售:"+batteryCheeseMikeTea);

    }
}
