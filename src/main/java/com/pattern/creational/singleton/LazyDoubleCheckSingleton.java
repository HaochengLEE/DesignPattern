package com.pattern.creational.singleton;

/**
 * @author lihaocheng
 * @create 2019-03-30 23:54
 **/

public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;
    private LazyDoubleCheckSingleton(){

    }


    public synchronized static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton==null){
                    lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton指向刚才的地址
                }

            }
            lazyDoubleCheckSingleton=new LazyDoubleCheckSingleton();
        }
        return lazyDoubleCheckSingleton;
    }




}
