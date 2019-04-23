package com.mall.concurrency.example.singleton;

import com.mall.concurrency.annoations.NotThreadSafe;

/*懒汉模式:单例的 实例在第一次使用的时候创建*/
@NotThreadSafe
public class SingeltonExample1 {
    //私有构造函数
    private SingeltonExample1(){

    }

    //单例对象
    private static SingeltonExample1 instance = null;

    //通过静态的工厂方法来获取对象
    public static SingeltonExample1 getInstance(){
        if (instance == null){
            instance = new SingeltonExample1();
        }
        return instance;
    }
}
