package com.testapp;

import java.lang.annotation.*;

/**
 * Created by facarvalho on 6/16/17.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@SuppressWarnings("Duplicates")
public @interface MyAnnotation {

    String value() default "";

}
