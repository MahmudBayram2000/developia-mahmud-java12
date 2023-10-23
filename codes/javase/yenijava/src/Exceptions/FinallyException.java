package Exceptions;

public class FinallyException {
    public static void main(String[] args) {

        try {
            int result=10/0;
        } catch (Exception e) {
            System.out.println("we cant divide for zero");
        } finally {
            int a=5;
            int b=25;
            int c=a*b;
            System.out.println(c);
            System.out.println("This block is always running");
        }
    }
}
