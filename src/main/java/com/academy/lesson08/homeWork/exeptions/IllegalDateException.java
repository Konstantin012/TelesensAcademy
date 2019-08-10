package com.academy.lesson08.homeWork.exeptions;

public class IllegalDateException extends Exception {
    @Override
    public String getMessage() {
        return "The date isn't correct";
    }
}
