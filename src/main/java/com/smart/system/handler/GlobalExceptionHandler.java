package com.smart.system.handler;

import com.smart.system.exception.DaoException;
import com.smart.system.exception.ServiceException;
import com.smart.system.utils.ErrorStatus;
import com.smart.system.utils.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 两个注解
 * 在类上面使用 @RestControllerAdvice
 * 在方法上面使用 ExceptionHandler
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    //    @ExceptionHandler
//    public ResponseEntity handlerException(Exception ex) {
//        if (ex instanceof ServiceException) {
//            return ResponseEntity.error(ErrorStatus.SERVICE_ERROR);
//        } else if (ex instanceof DaoException) {
//            return ResponseEntity.error(ErrorStatus.DAO_ERROR);
//        }
//        return ResponseEntity.error();
//    }
    // 走异常通知
    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerException(DaoException ex) {
        return ResponseEntity.error(ErrorStatus.SYS_ERROR);
    }

    // 走异常通知
    @ExceptionHandler(DaoException.class)
    public ResponseEntity handlerDaoException(DaoException ex) {
        return ResponseEntity.error(ErrorStatus.DAO_ERROR);
    }

    // 走异常通知
    public ResponseEntity handlerServuceException(ServiceException ex) {
        return ResponseEntity.error(ErrorStatus.SERVICE_ERROR);
    }
}
