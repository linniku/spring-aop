package com.yht.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 2018/9/22 9:05
 **/
@Aspect//切面类
@Component
public class SpringAspect {

    //定义切入点
    @Pointcut("execution(* com.yht.dao.*.*(..))")
    public void aspectJ(){

    }

    //定义切入点
    @Pointcut("within( com.yht.dao.*))")
    public void withinJ(){

    }

    //定义切入点
    @Pointcut("args(java.lang.String)")
    public void argsJ(){

    }

    //自定义注解
    @Pointcut("@annotation(com.yht.anno.DemoAnno)")
    public void pointAnno(){

    }

    //代理上面的目标 需要作用在目标对象上
    @Pointcut("target(com.yht.dao.UserDao)")
    public void pointTarget(){

    }

    //代理上面的类 需要作用在目标对象上
    @Pointcut("this(com.yht.dao.UserDao)")
    public void pointThis(){

    }

    @Around("com.yht.config.SpringAspect.aspectJ()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
        Object[] args= pjp.getArgs();
        String temp="";
        for (Object arg:args){
            if(arg.getClass().getSimpleName().equals("String")){
                temp=arg+"around";
            }
        }
        Object retVal=null;
        if(args!=null && args.length>0){
            retVal=pjp.proceed(new Object[]{temp});
        }else{
            retVal=pjp.proceed();
        }

        return retVal;
    }

    @After("com.yht.config.SpringAspect.aspectJ()")
    public void after(){
        System.out.println("after......");
    }

    @Before("com.yht.config.SpringAspect.pointTarget()")
    public void before(JoinPoint joinPoint){
        joinPoint.getThis();
        System.out.println("before123......");
    }

    @AfterThrowing("com.yht.config.SpringAspect.aspectJ()")
    public void afterThrowing(){
        System.out.println("throw......");
    }

}
