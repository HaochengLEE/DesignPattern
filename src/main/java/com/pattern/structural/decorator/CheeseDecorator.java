package com.pattern.structural.decorator;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class CheeseDecorator extends AbstractDecorator{
    public CheeseDecorator(AMikeTea aMikeTea) {
        super(aMikeTea);
    }

    @Override
    public String getName() {
        return super.getName()+"加奶盖";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+2;
    }
}
