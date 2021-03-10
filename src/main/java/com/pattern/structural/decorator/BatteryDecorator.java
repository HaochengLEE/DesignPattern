package com.pattern.structural.decorator;

import com.pattern.structural.decorator.AMikeTea;
import com.pattern.structural.decorator.AbstractDecorator;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class BatteryDecorator extends AbstractDecorator {
    public BatteryDecorator(AMikeTea aMikeTea) {
        super(aMikeTea);
    }

    @Override
    public String getName() {
        return super.getName()+"加草莓";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+3;
    }
}
