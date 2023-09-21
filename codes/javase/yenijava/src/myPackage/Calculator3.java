package myPackage;

public class Calculator3 {
    public static void main(String[] args) {

        Calculator3 calculator = new Calculator3();
        int Mahmud = calculator.average(5, 7);
        System.out.println("ededi orta :" + Mahmud);

    }
    public int average(int a,int b){
        return (a+b)/2;

    }
}
