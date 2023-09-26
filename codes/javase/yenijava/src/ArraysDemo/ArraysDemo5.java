package ArraysDemo;

public class ArraysDemo5 {
    public static void main(String[] args) {

        int [] numbers={5,8,9,4};

        int min=numbers[0];
        int max=numbers[0];

        for (int number:numbers) {
            if (min > number) {
                min = number;
            }
            if (max < number){
                max = number;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
