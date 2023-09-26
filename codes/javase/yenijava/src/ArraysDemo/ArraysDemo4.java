package ArraysDemo;

public class ArraysDemo4 {
    public static void main(String[] args) {

        int [] numbers={5,8,9,4};

        int sum=0;
        for (int number:numbers)
            sum += number;
        double  average=(double)sum/numbers.length;


        System.out.println(average);

        }

    }

