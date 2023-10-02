package StringPool;

import javax.management.StringValueExp;

public class String1 {
    public static void main(String[] args) {
        int i=123;
        String a=""+i;
        System.out.println(a);
        double d=444444.4444444D;
        a=""+d;
        System.out.println(a);
        boolean b=false;
        a=""+b;
        System.out.println(a);
        a= String.valueOf(b);
        System.out.println(a);
        char[] c={'a','b','f','v','r','g'};
        a=String.valueOf(c);
        System.out.println(a);
        a=String.valueOf(c,0,4);
        System.out.println(a);
    }

}
