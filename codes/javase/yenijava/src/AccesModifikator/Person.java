package AccesModifikator;

public class Person {

    public String name;
    public String surname;
    public int age;
    public String adress;
    public double height;

    public Person (String m){
        this.name=m;
    }
    public void  Mahmud(){
        System.out.println("Person name:"+name);
    }
    public Person (String ad,String sur){
        this.adress=ad;
        this.surname=sur;
    }
    public void PersonAdressandSurname(){
        System.out.println("Person adress:" +adress);
        System.out.println("Person surname:" +surname);
    }
    public Person(double h,int a ){
        height=h;
        age=a;
    }
    public void PersonHeightAndPersonAge(){
        System.out.println("Person height:"+height);
        System.out.println("Person age:"+age);
    }

}
