package ArraysDemo;

import java.util.Arrays;

public class ClassWork4 {
    public static void main(String[] args) {

        String[] fruits={"Apple","Pear","Banana","Orange"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        sorting(fruits);
        System.out.println(Arrays.toString(fruits));
    }
    static void sorting(String[]f){
        Arrays.sort(f);
    }
}
