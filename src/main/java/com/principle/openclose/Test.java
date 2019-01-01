package com.principle.openclose;

/**
 * @author lihaocheng
 * @create 2019-01-01 8:10 PM
 **/

public class Test {
    public static void main(String[] args) {
        ICourse JavaCourse = new JavaDiscountCourse(112,"java设计模式",328.0);
        System.out.println("课程id"+JavaCourse.getId());
        System.out.println("课程名称"+JavaCourse.getName());
        System.out.println("现价"+JavaCourse.getPrice()+"元");
        //
        System.out.println("原价"+((JavaDiscountCourse) JavaCourse).getOrginPrice()+"元");
    }

}
