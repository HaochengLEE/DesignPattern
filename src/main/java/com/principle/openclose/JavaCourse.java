package com.principle.openclose;

/**
 * @author lihaocheng
 * @create 2019-01-01 8:05 PM
 **/

public class JavaCourse implements ICourse{
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
