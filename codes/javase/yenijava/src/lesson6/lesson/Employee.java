package lesson6.lesson;

public class Employee {
    Integer id;
    String  name;
    String surName;
    String Phone;
    String adress;
    int salary;

    public Employee(Integer id,String Phone){
        System.out.println();
    }

    public Employee (String n){
        name=n;
        System.out.println(name);
    }
    public Employee (String name,String surName){
        System.out.println(name +" "+ surName);
    }
    public Employee (String na,String p,int s){
        name=na;
        Phone=p;
        salary=s;
        System.out.println(name +" "+ " "+ Phone +" "+ salary);
    }


}
