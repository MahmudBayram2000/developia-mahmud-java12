package StringPool;

public class endWiths2 {
    public static void main(String[] args) {
        String s="Programming";

        boolean s1=s.endsWith("ing"); //true
        boolean s2=s.endsWith("ram"); //false
        System.out.println(s1);
        //ikiside eyni seyi edir
        System.out.println(s.endsWith("Pro")); //false
        System.out.println(s.endsWith("ing")); //true
        System.out.println(s.endsWith("ming")); //true
        System.out.println(s.endsWith("Pro"));  //false
        System.out.println(s.endsWith("ramming")); //true
        System.out.println(s.endsWith("min"));  //false
    }
}
