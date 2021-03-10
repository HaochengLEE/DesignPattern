package com.pattern.structural.decorator;

/**
 * * @author lihaocheng
 * * @createtime 2021/2/9
 */
public class MikeTea extends AMikeTea{
    @Override
    public String getName() {
        return "脏脏奶茶";
    }

    @Override
    public int getPrice() {
        return 21;
    }
}
