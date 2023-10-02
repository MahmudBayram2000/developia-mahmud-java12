package StringPool;

public class endsWith {
    public static void main(String[] args) {
        String s="Java programming language is best programming language";

        boolean b=s.endsWith("e"); //true verir
        System.out.println(b); //sonuncu neyle bitir demekdi
        boolean b1=s.endsWith("r"); // false verecek
        System.out.println(b1);
        boolean b2=s.endsWith("uage");
        System.out.println(b2);
        boolean b3=s.startsWith("a");
        System.out.println(b3);


    }
}
