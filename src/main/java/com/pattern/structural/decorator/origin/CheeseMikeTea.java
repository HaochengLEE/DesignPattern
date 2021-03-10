package com.pattern.structural.decorator.origin;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class CheeseMikeTea extends MikeTea{
    @Override
    protected String getName() {
        return super.getName()+"加芝士奶盖";
    }

    @Override
    protected int getPirce() {
        return super.getPirce()+2;
    }
}
