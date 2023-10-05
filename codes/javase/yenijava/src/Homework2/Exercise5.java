package Homework2;

public class Exercise5 {
    public static void main(String[] args) {

        String name="Mahmud";
        String surname="Bayramov";
        String adress="Suraxani";


        System.out.println(name+" "+surname);

        String adress2=name.replace(name,adress);
        String adress3=surname.replace(surname,adress);
        System.out.println(adress2);
        System.out.println(adress3);
    }
}
