package HomeworkForOop;

public class Mainn {
    public static void main(String[] args) {

        Animal cat=new Cat("Mestan",2);
        Animal dog=new Dog("Kaplan",5);
        Animal lion=new Lion("Aslan",6);

        cat.makeNoise();
        dog.makeNoise();
        lion.makeNoise();
    }
}
