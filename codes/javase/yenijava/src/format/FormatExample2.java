package format;

public class FormatExample2 {
    public static void main(String[] args) {
         String name="Mahmud";
         String surname="Bayramov";
         int age=23;
         String adress="Zigh";
         float height=1.72f;

         String s1=String.format("My name is %s.\tMy surname is %s.\tI am %d years old.\tMy adress is %s.\tMy height is %.2f", name ,surname,age,adress,height) ;
        System.out.println(s1);
    }
}
