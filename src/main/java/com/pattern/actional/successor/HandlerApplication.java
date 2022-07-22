package com.pattern.actional.successor;

/**
 * @author lihaocheng
 * @createtime 2022/7/21
 */
public class HandlerApplication {
    public static void main(String[] args) {
        HandlerChain chain=new HandlerChain();
        chain.addHandler(new FirstHandler());
        chain.addHandler(new SecondHandler());
        chain.handle();
    }
}
