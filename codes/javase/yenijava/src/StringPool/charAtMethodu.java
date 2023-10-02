package StringPool;

public class charAtMethodu {
    public static void main(String[] args) {

        String Anything="Hello My Name is Mahmud,i am studying at Baku Engineering university,i will finish this year";
        int m=Anything.length(); //bunu uzunlugunu yoxlamaq ucun yazmisam
        System.out.println(m);

        char s=Anything.charAt(30);
        System.out.println(s);
        s=Anything.charAt(32);
        System.out.println(s);
        s=Anything.charAt(35);
        System.out.println(s);
        s=Anything.charAt(91);
        System.out.println(s);
    }
}
