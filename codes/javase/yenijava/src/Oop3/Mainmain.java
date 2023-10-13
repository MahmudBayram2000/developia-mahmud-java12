package Oop3;

public class Mainmain {
    public static void main(String[] args) {

        Plant[] plants={new Cactus(),new Fern()};

        for (Plant plant:plants){
            plant.growthBehavior();
        }
    }
}
