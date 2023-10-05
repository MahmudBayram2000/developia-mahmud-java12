package format;

public class FormatExample {
    public static void main(String[] args) {
         String str1=String.format("%d",101); //Integer value
         String str2=String.format("%s","Mahmud Bayramov"); //String value
         String str3=String.format("%f",101.00); //float value
         String str4=String.format("%x",101); //hexademical
         String str5=String.format("%c",'c'); //char value

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        String name="Mahmud";
        int age=23;
        String adress="Suraxani";

        String s1=String.format("My name is %s,I am %d years old,I live in %s ",name,age,adress);

        System.out.println(s1);

    }
}
