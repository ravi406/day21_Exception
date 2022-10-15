package com.java.day21;

public class MoodAnalysisException extends RuntimeException {
    private static final long serialVersionUID = 4930705957917361473L;
    ExceptionType excType;

    enum ExceptionType {
        IS_EMPTY, IS_NULL
    }

    MoodAnalysisException() {

    }

    MoodAnalysisException(ExceptionType et, String message) {
        super(message);
        excType = et;
    }
}
