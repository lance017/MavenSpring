package com.atguigu.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lance017 on 2017/4/28.
 */
// 指定切面的优先级，值越小优先级越高
@Order(1)
@Aspect
@Component
public class LoggingAspect {
    /**
     * 定义一个方法，用于声明切入点表达式，一般的，该方法中再不需要填入其他的代码
     * 声明切入点表达式
     * 后面的通知直接使用方法名来引用当前的切入点表达式
     */
    @Pointcut("execution(* *.*(..))")
    public void declareJointPointExpression() {

    }

    /**
     * 声明该方法是一个前置通知,方法实现之前执行
     */
//    @Before("execution(* *.*(..))")
    @Before("declareJointPointExpression()")
    public void beforeMethod(JoinPoint joinPoint) {
//        方法名
        String methodName = joinPoint.getSignature().getName();
//        参数列表
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("the methon "+ methodName + " begins with " + args);
    }

    /**
     * 声明该方法是一个后置通知,方法实现之后执行(无论是否发生异常)
     * 后置通知还不能访问目标方法执行的结果
     */
    @After("declareJointPointExpression()")
    public void afterMethod(JoinPoint joinPoint) {
//        方法名
        String methodName = joinPoint.getSignature().getName();
        System.out.println("the methon "+ methodName + " ends");
    }

    /**
     * 声明该方法是一个返回通知,在方法正常结束后执行的通知
     * 返回通知能够访问目标方法执行的结果
     */
    @AfterReturning(value = "declareJointPointExpression()",returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        //        方法名
        String methodName = joinPoint.getSignature().getName();
        System.out.println("the methon "+ methodName + " ends with " + result);
    }

    /**
     * 声明该方法是一个异常通知,在方法出现异常时执行的通知
     * 可以访问到异常对象。可以指定特定异常再执行
     */
    @AfterThrowing(value = "declareJointPointExpression()",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        //        方法名
        String methodName = joinPoint.getSignature().getName();
        System.out.println("the methon "+ methodName + " occurs excetion: " + ex);
    }
}
