package Exceptions;

public class CustomException {
    public static void main(String[] args) {
        try {
            checkNumber(0);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
    public static void checkNumber(int number) throws CustomException {
        if (number == 0) {
            throw new CustomException("Sayı sıfırdır!");
        }
        System.out.println("Sayı geçerlidir.");
    }
}