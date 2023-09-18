public class Computer {

    String id;

    int age;
    String model;
    String color;

    public Computer (String m,String c){
        model=m;
        color=c;
        System.out.println(model +" "+ color);
    }
    public Computer (String i){
        id=i;
        System.out.println(id);
    }
    public Computer(int a){
        age=a;
        System.out.println(age);
    }

}

