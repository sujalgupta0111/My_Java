package com.CustomException;
// Custom Checked Exception
class MyCheckedException extends Exception {
    private String message;

    public MyCheckedException(String message) {
        this.message = message; // super() nahi use kiya
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class CheckedExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // yaha exception aa sakti hai
        } catch (MyCheckedException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }

    // throws mandatory for checked exceptions
    public static void validateAge(int age) throws MyCheckedException {
        if (age < 18) {
            throw new MyCheckedException("Age must be 18 or above!");
        }
        System.out.println("Age is valid");
    }
}
