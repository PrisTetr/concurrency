package com.mall.concurrency.example.singleton;

import com.mall.concurrency.annoations.Recommend;
import com.mall.concurrency.annoations.ThreadSafe;

/*枚举模式：最安全*/
@ThreadSafe
@Recommend
public class SingeltonExample7 {

    //私有构造函数
    private SingeltonExample7() {

    }

    public static SingeltonExample7 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;
        private SingeltonExample7 singleton;
        //jvm保证这个方法绝对只调用一次
        Singleton(){
            singleton = new SingeltonExample7();
        }
        public SingeltonExample7 getInstance(){
            return singleton;
        }
    }
}
