package com.pattern.creational.singleton;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author lihaocheng
 * @create 2019-03-28 23:38
 **/

public class Test {
    public static void main(String[] args) {
//        LazySingleton lazySingleton=LazySingleton.getInstance();
//        Thread thread1=new Thread(new T());
//        Thread thread2=new Thread(new T());
//        thread1.start();
//        thread2.start();
//        System.out.println("program end");
        HungrySingleton instance=HungrySingleton.getInstance();
//        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream())
    }


}
