package com.pattern.creational.singleton;

/**
 * @author lihaocheng
 * @create 2019-04-01 23:38
 **/

public class HungrySingleton {
    private final static HungrySingleton hungrysingleton;
    static {
        hungrysingleton=new HungrySingleton();
    }
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return hungrysingleton;
    }



}
