package com.jeang.study.e_Exception;

// 自定义异常类
public class NameFormatExcepton extends RuntimeException {
    public NameFormatExcepton() {
    }

    public NameFormatExcepton(String message) {
        super(message);
    }
}
