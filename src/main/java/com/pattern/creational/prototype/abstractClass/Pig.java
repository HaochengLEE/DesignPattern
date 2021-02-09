package com.pattern.creational.prototype.abstractClass;

import java.util.ArrayList;
import java.util.Date;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/7
 */
public class Pig implements Cloneable{
    private String name;
    private Integer age;
    private Date date;


    public Pig(String name, Integer age,Date date) {
        this.name = name;
        this.age = age;
        this.date=date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}'+super.toString();
    }

    /**
     * 重写clone方法
     * @return
     * @throws CloneNotSupportedException
     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    /**
     * 想要实现Date的深拷贝，就必须重写clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig=(Pig) super.clone();
        //单独为date写一遍clone
        pig.date= (Date) pig.date.clone();
        return pig;
    }
}
