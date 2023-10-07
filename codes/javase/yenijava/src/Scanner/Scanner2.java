package Scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {

        Scanner myscanner=new Scanner(System.in);

        System.out.println("Your age in months is: X");

        int u=myscanner.nextInt();

        int u2=u*12;

        System.out.println(u2);

    }
}
