package Scanner;

import java.util.Scanner;

public class ScannerCode {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age here");

        int i=scanner.nextInt();

        int ageInDays=i*365;

        System.out.println(ageInDays);

        scanner.close();
    }
}


