package StringPool;

public class ConcatMethod {
    public static void main(String[] args) {
        String s1="Mahmud";
        String s2="Bayramov";


        String s3=s1+s2; //normal qayda ile
        System.out.println(s3);
        String s4=s2.concat(s1);  //concatlada etmek olur
        System.out.println(s4);
        String s5=s1.concat(s2);
        System.out.println(s5);
    }
}
