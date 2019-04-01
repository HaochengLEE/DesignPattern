package com.pattern.creational.singleton;

/**
 * @author lihaocheng
 * @create 2019-04-01 00:14
 **/

public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();

    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){

    }


}
