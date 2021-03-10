package com.pattern.structural.adapter.objadapter;

/**
 * * @author lihaocheng
 * * @createtime 2021/3/10
 */
public class Adapter1 implements Target{
    private Adapter adapter=new Adapter();
    @Override
    public void request() {
        adapter.request();
    }
}
