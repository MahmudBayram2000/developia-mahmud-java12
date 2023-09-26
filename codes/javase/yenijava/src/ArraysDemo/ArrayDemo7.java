package ArraysDemo;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] numbers = {6, 7, 8, 9, 12};

        for (int number:numbers){
            if (number %2 ==0)
                System.out.println(number);
        }
    }
}
