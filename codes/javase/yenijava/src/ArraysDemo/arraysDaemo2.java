package ArraysDemo;

public class arraysDaemo2 {

    public static void main(String[] args) {
        int[] number={5, 10, 15, 20, 25};

        int min=number[0];
        for (int numbers:number){
            if (numbers < min)
                min=numbers;
        }
        System.out.println(min);
    }
}
