package com.smart.system.aop;

import com.smart.system.exception.ServiceException;
import com.smart.system.utils.ResponseEntity;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GlobalExAspect {
    //    @Pointcut(value = "@annotation(org.springframework.web.bind.annotation.RestController)")
    @Pointcut(value = "execution(* com.smart.system.controller.*(..))")
    public void pointcut() {
        System.out.println(1111);
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public ResponseEntity afterThrowing(Exception exception) {
        if (exception instanceof ServiceException) {

        }
        return ResponseEntity.error();
    }

}
