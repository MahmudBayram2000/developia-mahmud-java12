package Encapsulation;

public class Student2 {

    private String name;
    private int age;

    public Student2(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }else {
            System.out.println("0 dan kicikdir");
            }
            this.age = 0;
        }
    }

