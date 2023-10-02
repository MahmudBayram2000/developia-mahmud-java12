package StringPool;

public class indexOf {
    public static void main(String[] args) {

        String s="Java programming language is good programming language";
        String s1="language";

        System.out.println(s.indexOf(s1));
        System.out.println(s.indexOf("a"));
        System.out.println(s.indexOf("lang",10));
        System.out.println(s.indexOf("lang"));
    }
}
