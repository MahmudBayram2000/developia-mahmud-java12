package format;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(31,50);
        System.out.println(number);
    }
}
