package com.pattern.structural.decorator.origin;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class BatteryCheeseMikeTea extends CheeseMikeTea{
    @Override
    protected String getName() {
        return super.getName()+"加草莓";
    }

    @Override
    protected int getPirce() {
        return super.getPirce();
    }
}
