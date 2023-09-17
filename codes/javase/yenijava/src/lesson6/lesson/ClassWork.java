package lesson6.lesson;

public class ClassWork {
    public static void main(String[] args) {
        Computer hp=new Computer();
        hp.cpuPrice=300;
        hp.ramPrice=200;
        hp.otherPrices=700;
        Calculator calculator=new Calculator();
        calculator.calculateComputerTotalPrice(hp);
    }
}

class Computer {
    int cpuPrice;
    int ramPrice;
    int otherPrices;

}