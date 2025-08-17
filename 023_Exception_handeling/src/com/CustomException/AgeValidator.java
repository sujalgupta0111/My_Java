package com.CustomException;


class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
              throw new InvalidAgeException("Umar 18 se kam nahi ho sakti.");
        }
        System.out.println("Umar " + age + " valid hai.");
    }

    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        try {
            validator.validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("---");

        try {
            validator.validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}