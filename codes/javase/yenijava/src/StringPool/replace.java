package StringPool;

public class replace {
    public static void main(String[] args) {
        String s="My name is Mahmud,my surname is Bayramov";
        String s1=s.replace("Mahmud","Bayram");
        System.out.println(s1);
        String s2=s.replace('M','e');
        System.out.println(s2);
        String s3=s1.replaceAll("is","are");
        System.out.println(s3);
        String s4=s.replaceFirst("is","are");
        System.out.println(s4);
    }
}
