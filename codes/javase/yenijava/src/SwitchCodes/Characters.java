package SwitchCodes;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {

        Scanner myscanner=new Scanner(System.in);
        System.out.print("Enter a grade (A, B, C, D, F): ");
        char grades=myscanner.next().charAt(0);

        String message;

        switch (grades){
            case 'A':
            case 'a':
                message="Excellent";
                break;
            case 'B':
            case 'b':
                message="Good job";
                break;
            case 'C':
            case 'c':
                message="Well done";
                break;
            case 'D':
            case 'd':
                message="You Passed";
                break;
            case 'F':
            case 'f':
                message="Failed";
                break;
            default:
                message="Invalid grade input";
        }
        System.out.println(message);
        myscanner.close();
        }

    }
