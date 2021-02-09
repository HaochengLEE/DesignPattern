package com.pattern.creational.prototype.abstractClass;

import java.util.Date;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/7
 */
public class TestPig {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date=new Date(0);
        Pig pigpq=new Pig("佩奇",8,date);
        Pig pigjohn= (Pig) pigpq.clone();

        System.out.println("佩奇"+pigpq);
        System.out.println("乔治"+pigjohn);
        System.out.println("---------------------");
        //乔治是6岁
        pigjohn.setAge(6);
        pigjohn.getDate().setTime(20010313L);
        System.out.println("佩奇"+pigpq);
        System.out.println("乔治"+pigjohn);

    }
}
