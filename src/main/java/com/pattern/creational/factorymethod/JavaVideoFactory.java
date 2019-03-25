package com.pattern.creational.factorymethod;

/**
 * @author lihaocheng
 * @create 2019-03-25 21:05
 **/

public class JavaVideoFactory  extends VideoFactory{

    public Video create() {
        return new JavaVideo();
    }
}
