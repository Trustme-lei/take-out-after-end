package com.js.ls.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 雷升
 * @date 2020/4/11 20:49
 */
@Target({ElementType.PARAMETER})//参数级别 用于描述参数
@Retention(RetentionPolicy.RUNTIME) //注解保留到运行阶段
public @interface NoNull {
}
