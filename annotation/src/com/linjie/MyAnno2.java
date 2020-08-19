package com.linjie;

import java.lang.annotation.*;

//ElementType.TYPE:表示注解只能作用于类上
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})

//RetentionPolicy.RUNTIME:会被保留到class字节码文件中，并被JVM读取到
//RetentionPolicy.CLASS:会被保留到class字节码文件中，但不会被JVM读取到
@Retention(RetentionPolicy.RUNTIME)

@Documented

@Inherited
public @interface MyAnno2 {

}
