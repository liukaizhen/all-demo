package com.sean.springboot.annotation;

import java.lang.annotation.*;

/**
 * @author sean
 */
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ReturnToken {
}
