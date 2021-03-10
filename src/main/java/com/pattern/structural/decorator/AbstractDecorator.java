package com.pattern.structural.decorator;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class AbstractDecorator extends AMikeTea{
    private AMikeTea aMikeTea;

    public AbstractDecorator(AMikeTea aMikeTea) {
        this.aMikeTea = aMikeTea;
    }

    @Override
    public String getName() {
        return this.aMikeTea.getName();
    }

    @Override
    public int getPrice() {
        return this.aMikeTea.getPrice();
    }
}
