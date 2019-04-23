package com.mall.concurrency.example.singleton;

import com.mall.concurrency.annoations.ThreadSafe;

/**懒汉模式->> 双重同步锁单例模式
*单例的实例在第一次使用的时候创建
 */
@ThreadSafe
public class SingeltonExample5 {
    //私有构造函数
    private SingeltonExample5(){

    }

    //1.memory = allocate() 分配对象内存空间
    //2.ctorInstance() 初始化对象
    //3.instance = memory 设置instance指向刚分配的内存

    //单例对象
    //使用 volatile + 双重检测机制 -> 禁止指令重排
    private volatile static SingeltonExample5 instance = null;

    //通过静态的工厂方法来获取对象
    public static synchronized SingeltonExample5 getInstance(){
        if (instance == null){ //双重检测机制
            synchronized (SingeltonExample5.class){ //同步锁
                if (instance == null) {
                    instance = new SingeltonExample5();
                }
            }
        }
        return instance;
    }
}
