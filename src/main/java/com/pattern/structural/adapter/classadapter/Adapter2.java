package com.pattern.structural.adapter.classadapter;

/**
 * * @author lihaocheng
 * * @createtime 2021/3/10
 */
public class Adapter2 extends Adapter implements Target{
    @Override
    public void request() {
        super.adapterRequest();
    }
}
