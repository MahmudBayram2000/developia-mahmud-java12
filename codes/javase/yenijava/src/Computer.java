public class Computer {

    String id;
    String brand;
    String model;
    String color;

    public Computer (String m,String c){
        model=m;
        color=c;
        System.out.println(model +" "+ color);
    }
    public Computer(String model) {
        System.out.println("Mercedes");
    }


    public  Computer() {
        System.out.println();

    }
}
