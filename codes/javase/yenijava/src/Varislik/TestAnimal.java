package Varislik;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal=new Animal("Dog");
        animal.speak();

        Dog dog=new Dog("Bully");
        dog.speak();
    }
}
