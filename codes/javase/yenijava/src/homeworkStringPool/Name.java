package homeworkStringPool;

import java.util.Arrays;

public class Name {
    public static void main(String[] args) {

        String name="Cavid";
        System.out.println(name);

        String message="Java programming language is best programming language";
        String message2="language";
        System.out.println(message);

        int i=message.length();
        int b=name.length();
        System.out.println(i);
        System.out.println(b);

        System.out.println(message.indexOf("i")); //necenci indeksde oldugunu tapmaq

        System.out.println(message.toLowerCase()); // yazdigimiz metnin herflerini kiciltmek

        System.out.println(message.toUpperCase()); //yazdigimiz metnin herflerini boyuden

        System.out.println(message.indexOf(message2)); //simvolun olub-olmadığını tapmaq

        System.out.println(message.endsWith("age"));

        System.out.println(message.startsWith("Java"));

        name="    Adil   ";

        System.out.println(name.trim());
        System.out.println(name);

        name="Bextiyar";
        String name2=name.substring(0,4);
        System.out.println(name2);

        name="Eli Hesenov";
        String[] name3=name.split(" ");
        System.out.println(Arrays.toString(name3));







    }
}
