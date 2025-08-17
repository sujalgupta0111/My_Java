package com.CustomException;
// Custom Unchecked Exception
class MyUncheckedException extends RuntimeException {
    private String message;

    public MyUncheckedException(String message) {
        this.message = message; // super() nahi use kiya
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class UncheckedExample {
    public static void main(String[] args) {
        validateAge(15); // yaha throws likhna zaroori nahi
        System.out.println("Program continues...");
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new MyUncheckedException("Age must be 18 or above!");
        }
        System.out.println("Age is valid");
    }
}
