import java.util.Random;

public class Maths {
    public static void main(String[] args) {

        int n=-8; //
        int n2=-65;
        int value=Math.abs(n);
        System.out.println(Math.abs(n));//modulunu tapir
        //int value2=Math.abs(n2);
        //System.out.println(value2);
        //System.out.println(value);

        int a=125;
        int b=136;
        System.out.println(Math.max(a,b)); //ikisi arasindaki en boyuyunu tapir
        System.out.println(Math.min(a,b)); // iki eded arasinda en kiciyini tapir

        double a1=2.9999999999999999999d;
        float b2=3.65000000000000000045f;
        System.out.println(Math.round(a1)); //yuvarlasdirmaq
        System.out.println(Math.round(b2)); //yuvarlasdirmaq

        int m=6;
        System.out.println(Math.sqrt(m)); //kokalti

        int m1=9;
        System.out.println(Math.cbrt(m1)); //kubunu

        int v=15;
        int v1=3;
        v=18;
        v1=2;
        System.out.println(Math.pow(v,v1)); //ustunu tapir 15 ustu 3

        double d=2.9;
        System.out.println(Math.ceil(d)); //ancaq boyuye yuvarlasdirmaq
        System.out.println(Math.floor(d)); //asagi dogru yuvarlasdirmaq

        Random random=new Random();
        System.out.println(random.nextInt(10,30));
    }
}
