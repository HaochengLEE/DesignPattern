package com.pattern.creational.singleton;

/**
 * @author lihaocheng
 * @create 2019-03-28 23:36
 **/

//懒汉式实现单例模式
public class LazySingleton {

    private static LazySingleton lazySingleton=null;
    private LazySingleton(){

    }


    public synchronized static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

}
