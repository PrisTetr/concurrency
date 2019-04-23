package com.mall.concurrency.example.singleton;

import com.mall.concurrency.annoations.NotThreadSafe;

/**懒汉模式->> 双重同步锁单例模式
*单例的实例在第一次使用的时候创建
 */
@NotThreadSafe
public class SingeltonExample4 {
    //私有构造函数
    private SingeltonExample4(){

    }

    //1.memory = allocate() 分配对象内存空间
    //2.ctorInstance() 初始化对象
    //3.instance = memory 设置instance指向刚分配的内存

    //jvm和cpu优化，发生了指令重排,所以线程不安全
    //1.memory = allocate() 分配对象内存空间
    //3.instance = memory 设置instance指向刚分配的内存
    //2.ctorInstance() 初始化对象

    //单例对象
    private static SingeltonExample4 instance = null;

    //通过静态的工厂方法来获取对象
    public static synchronized SingeltonExample4 getInstance(){
        if (instance == null){ //双重检测机制
            synchronized (SingeltonExample4.class){ //同步锁
                if (instance == null) {
                    instance = new SingeltonExample4();
                }
            }
        }
        return instance;
    }
}
