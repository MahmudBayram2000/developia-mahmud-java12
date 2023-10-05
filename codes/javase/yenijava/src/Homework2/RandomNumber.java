package Homework2;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random=new Random();
        int randomNumber = random.nextInt(21) + 30;
        System.out.println(random);
    }
}


