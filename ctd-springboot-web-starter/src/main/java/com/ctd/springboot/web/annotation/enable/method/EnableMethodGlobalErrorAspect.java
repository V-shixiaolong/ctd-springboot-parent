package com.ctd.springboot.web.annotation.enable.method;

import com.ctd.springboot.web.registrar.globa.error.method.GlobalMethodLevelErrorImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 类上注解，拦截全局异常
 *
 * @author chentudong
 * @date 2020/8/14 17:15
 * @since 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Inherited
@Import(GlobalMethodLevelErrorImportBeanDefinitionRegistrar.class)
public @interface EnableMethodGlobalErrorAspect {
}
