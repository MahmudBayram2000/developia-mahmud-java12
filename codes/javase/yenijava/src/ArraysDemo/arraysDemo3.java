package ArraysDemo;

public class arraysDemo3 {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25, 30, 35};
        
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}