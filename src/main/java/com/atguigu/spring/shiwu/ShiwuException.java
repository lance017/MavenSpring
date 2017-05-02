package com.atguigu.spring.shiwu;

/**
 * Created by lance017 on 2017/5/2.
 */
public class ShiwuException extends RuntimeException {

    public ShiwuException() {
    }

    public ShiwuException(String message) {
        super(message);
    }

    public ShiwuException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShiwuException(Throwable cause) {
        super(cause);
    }

    public ShiwuException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
