package myPackage;

public class Methods2 {
    public static void main(String[] args) {

        Methods2 Mahmud=new Methods2();
        Mahmud.printName(15,"Mahmud");

        {
            Mahmud.printName(18,"Orxan");
        }
        {
            Mahmud.printName(17,"Cavad");
        }

    }
    public void printName(int count,String name){
        System.out.println(name+" "+count);
    }
}
