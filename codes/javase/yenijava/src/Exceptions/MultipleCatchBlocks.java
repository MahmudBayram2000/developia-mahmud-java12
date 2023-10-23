package Exceptions;

public class MultipleCatchBlocks {
    public static void main(String[] args) {

        int b=12;

        try {
            int a = Integer.parseInt("1a");
            System.out.println(a);
        }
        catch (NumberFormatException e){
            System.out.println("Number format is not going well");
        }
    }
}
