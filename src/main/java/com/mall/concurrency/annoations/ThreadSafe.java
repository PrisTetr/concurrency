package com.mall.concurrency.annoations;
//自定义注解

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*项目中用来标记【线程安全】的类或者写法*/

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)  //注解的作用
public @interface ThreadSafe {
    String value() default "";
}
