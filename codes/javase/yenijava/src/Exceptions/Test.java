package Exceptions;


public class Test {
    public static void main(String[] args) {

    int a=6;
    int b=0;
    try {
        System.out.println(a/b);
    }
    catch (ArithmeticException e){
        System.out.println("Divided by zero division is not possible");
    }
}
}