package Exceptions;

import java.util.IllformedLocaleException;

public class ThrowingExcepition {
    public static void main(String[] args) {

        try {
            checkingNegativeNumber(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void checkingNegativeNumber(int number) {
        if ( number < 0){
            throw new IllegalArgumentException("Checking it is Negative");
        }
    }
}
