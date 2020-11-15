> 单例模式中一个类只允许创建一个对象
# 一、应用场景
系统中只需要保持一份，例如配置信息
# 二、加载方式
## 1.饿汉式
- 线程安全
- 不支持延迟加载
```
private final static HungrySingleton hungrysingleton;
static {
        hungrysingleton=new HungrySingleton();
}
```
## 2.懒汉式
- 线程不安全，需要增加 synchronzed
- 加锁后性能瓶颈
```
public synchronized static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
```
## 3.双重检测
既支持延迟加载，又支持高并发
```
private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;
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
        }
        return lazyDoubleCheckSingleton;
    }

```

volatile 关键字用于禁止指令重排序，防止 layDoubleCheckSingleton 被其他线程使用
不过，只有很低版本的 JDK 才会有这个问题，高版本中将 new 操作设计为原子操作，不存在这个问题。

## 4.静态内部类
使用静态内部类，交给 JDK
```
//静态内部类
private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
}
 //只有调用 getInstance 的时候，StaticInnerClassSingleton 才会被加载
public static final StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
}
```
## 三、单例模式缺点
1. 不支持面向对象特性，违背了基于接口而非实现的原则。
2. 隐藏类之间的依赖关系，可读性差。
3. 扩展性不友好。
4. 可测试性不友好，无法实现 mock 替换。
5. 单例不支持有参数的构造函数

