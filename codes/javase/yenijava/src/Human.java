public class Human {

    String name;
    Double height;
    int age;
    int graduationYear;
    String realationShip;

    public Human (String n,Double h, int a,int y,String r){

        realationShip =r;
        graduationYear=y;
        name=n;
        height=h;
        age=a;
        System.out.println("Mahmud salam");

    }

    void makeNoise(){
        System.out.println("Yes Sir");
    }


}
