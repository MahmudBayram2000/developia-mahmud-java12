package AccesModificator1;

public class Person {

        public String name;
        public int age;
        private String surname;
        protected int BorningYear;



    public void introduceYourself() {
        name="Mahmud";
        System.out.println("Hello, my name is " + name);
    }

    public void Age(){
        age=23;
        System.out.println(age++);
    }

    public void SecondName(){
        System.out.println("Bayramov");
    }

    public void Born(){
        System.out.println(1999);
    }

}


