package homeworkStringPool;

import java.util.Arrays;

public class SexondHomework {
    public static void main(String[] args) {

        String name="Meherrem";
        System.out.println(name);
        String message="Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println(message);
        System.out.println(message.length()); //uzunlugunu tapir
        System.out.println(message.charAt(7)); //7ci simvolu konsola cap et
        System.out.println(message.indexOf("n")); //n simvolunu indeksini tap
        System.out.println(message.toLowerCase()); //kicik herf etmek hamisini
        System.out.println(message.toUpperCase()); //boyuk herf etmek hamisini
        System.out.println(message.contains("dilini")); //setirde olub olmadigini yoxlamaq
        System.out.println(message.endsWith("dalıdır"));
        System.out.println(message.startsWith("Java"));
        name="      Ayxan        ";
        System.out.println(name);
        System.out.println(name.trim());
        name="Kamil";
        System.out.println(name);
        String name2=name.substring(0,4);
        System.out.println(name2);
        name="Huseyn Mehdizade";
        String[] m=name.split(" ");
        System.out.println(Arrays.toString(m));





    }
}
