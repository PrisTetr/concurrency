package com.mall.concurrency.example.singleton;

import com.mall.concurrency.annoations.ThreadSafe;

/*饿汉模式:单例的 实例在类装载的时候创建*/
//如果构造函数有太多的操作处理会让装载速度变得很慢；会造成资源的浪费
@ThreadSafe
public class SingeltonExample2 {
    //私有构造函数
    private SingeltonExample2(){

    }

    //单例对象
    private static SingeltonExample2 instance = new SingeltonExample2();

    //通过静态的工厂方法来获取对象
    public static SingeltonExample2 getInstance(){
        return instance;
    }
}
