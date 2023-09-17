package lesson6.lesson;

public class Calculator {

    void calculateComputerTotalPrice (Computer c) {

        int totalPrice=c.cpuPrice+ c.ramPrice+c.otherPrices;
        System.out.println("Total price=" + totalPrice);
    }
}
