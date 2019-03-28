package com.pattern.creational.singleton;

/**
 * @author lihaocheng
 * @create 2019-03-28 23:42
 **/

public class T implements Runnable{

    public void run() {
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+lazySingleton);
    }
}
