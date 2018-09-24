package com.yht.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 2018/9/19 6:13
 **/
@Configuration //就相当于使用spring.xml配置文件
@ComponentScan("com.yht")
@EnableAspectJAutoProxy(proxyTargetClass = false) //相当于 xml配置<aop:aspectj-autoproxy/>
public class AppConfig {

}
