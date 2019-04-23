package com.mall.concurrency.example.singleton;

import com.mall.concurrency.annoations.NotRecommend;
import com.mall.concurrency.annoations.ThreadSafe;

/*懒汉模式:单例的 实例在第一次使用的时候创建*/
@ThreadSafe
@NotRecommend  //虽然编程线程安全，却会带来性能上面的开销
public class SingeltonExample3 {
    //私有构造函数
    private SingeltonExample3(){

    }

    //单例对象
    private static SingeltonExample3 instance = null;

    //通过静态的工厂方法来获取对象
    public static synchronized SingeltonExample3 getInstance(){
        if (instance == null){
            instance = new SingeltonExample3();
        }
        return instance;
    }
}
