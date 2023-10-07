package HomeworkFromMaths;


import java.util.Random;

public class Homework0 {
    public static void main(String[] args) {

        int[] Numbers={1,2,3,4,5};
        String s=String.valueOf(Numbers);
        System.out.println(s);

        String name=" ";
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());

        Random random=new Random();
        int a=random.nextInt(10,30);
        System.out.println(a);

        double d=1.25020505;
        String st=String.format("%.3f",d);
        System.out.println(st);
    }
}
