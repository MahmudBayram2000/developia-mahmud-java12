package Homework2;

public class Exercise4 {
    public static void main(String[] args) {

        String original = "Hello World";
        String search = "World";
        String replaceWith = "Java";

        String result = replace(original, search, replaceWith);
        System.out.println(result);

    }

    public static String replace(String original, String search, String replaceWith) {
        return original.replace(search, replaceWith);

    }
}




