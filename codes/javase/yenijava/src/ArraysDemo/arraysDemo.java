package ArraysDemo;

public class arraysDemo {
    public static void main(String[] args) {

        int[] number={5, 10, 15, 20, 25};


        int sum=0;
        for (int numbers:number) {
            sum += numbers;
        }
        double average=(double)sum/number.length;
        System.out.println(average);
        }
    }

