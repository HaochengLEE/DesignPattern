package com.pattern.creational.singleton;

/**
 * @author lihaocheng
 * @create 2019-03-30 23:54
 **/

//双重检测实现单例模式
public class LazyDoubleCheckSingleton {

    //volatile 关键字用于禁止指令重排序，防止 layDoubleCheckSingleton 被其他线程使用
    //不过，只有很低版本的 JDK 才会有这个问题，高版本中将 new 操作设计为原子操作
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
