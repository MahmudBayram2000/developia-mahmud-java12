public class CarProperties {
    public static void main(String[] args) {

        Car Bmw=new Car();
        Bmw.price="19.0000";
        Bmw.brand="BMW";
        Bmw.color="Red";
        Bmw.model="F10";


        Car RangeRover=new Car();
        RangeRover.price="30.000";
        RangeRover.brand="Range Rover";
        RangeRover.color="White";
        RangeRover.model="Range Rover2020";

        System.out.println(Bmw.price+Bmw.brand+Bmw.color+Bmw.model);


    }
}
