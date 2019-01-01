package com.principle.openclose;

/**
 * @author lihaocheng
 * @create 2019-01-01 8:24 PM
 **/

public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOrginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
