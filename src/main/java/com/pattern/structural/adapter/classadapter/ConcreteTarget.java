package com.pattern.structural.adapter.classadapter;

/**
 * * @author lihaocheng
 * * @createtime 2021/3/10
 */
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("目标方法");
    }
}
