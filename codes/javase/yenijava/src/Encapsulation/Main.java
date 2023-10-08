package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Developer developer=new Developer();
        developer.age=23;
        developer.name="Mahmud";
        developer.surname="Bayramov";
        developer.salary=1250;
        developer.job="Programmer";
        System.out.println(developer.name+" "+developer.surname);
        System.out.println(developer.age);
        System.out.println(developer.job+" "+developer.salary);
    }
}
