package com.pattern.creational.singleton;

/**
 * @author lihaocheng
 * @create 2019-03-28 23:42
 **/

public class T implements Runnable{

    public void run() {
//        LazySingleton lazySingleton=LazySingleton.getInstance();
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton=LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton=StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+staticInnerClassSingleton);
    }
}
