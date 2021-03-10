package com.pattern.structural.adapter.classadapter;

/**
 * * @author lihaocheng
 * * @createtime 2021/3/10
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target=new ConcreteTarget();
        target.request();

        Target target1=new Adapter2();
        target1.request();
    }
}
