package com.mall.concurrency.example.publish;

import com.mall.concurrency.annoations.NotRecommend;
import com.mall.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NotThreadSafe
@NotRecommend
public class Escape {
    private int thisCanBeEscape = 0;
    public Escape(){
        new InnerClass();
    }
    private class InnerClass{
        public InnerClass(){
            //在对象构造未完成之前被其他线程可见
            log.info("{}",Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
