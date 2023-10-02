package StringPool;

public class CopyValueOf {
    public static void main(String[] args) {

        char[] Name={'M','A','H','M','U','D'};
        String NameOfPerson=String.copyValueOf(Name,0,5);
        System.out.println(NameOfPerson);
    }
}
