package Encapsulation;

public class testStudenClass {
    public static void main(String[] args) {

        Student2 student=new Student2("Mahmud",23);
        System.out.println(student.getName()+" "+student.getAge());
        student.setAge(-5);
        System.out.println(student.getAge()+student.getName());

    }
}
