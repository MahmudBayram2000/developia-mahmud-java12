package HashMap;

public class Main {

    public static void main(String[] args) {

        //yeni student yaradir
        Student student=new Student("Mahmud","180180");

        //yeni komputer elave edir
        student.addComputer(1,new Computer("HP","Pavilion"));
        student.addComputer(2,new Computer("Dell","Pavilion"));
        student.addComputer(3,new Computer("Samsung","B"));
        student.addComputer(4,new Computer("Samsung","D"));
        student.addComputer(5,new Computer("Apple","B"));


        //komputerleri gostermek

        student.displayComputers();


    }
}
