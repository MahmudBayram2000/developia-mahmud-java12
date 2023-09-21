package pass_by_reference;

public class MainClassM {
    public static void main(String[] args) {
        Person P=new Person();
        P.name="Mahmud";
        P.surname="Bayramov";
        P.experienceYear="3 year";
        P.phone="0508508587";
        P.salary=1250;
        System.out.println(P.name+" "+P.surname+" "+P.experienceYear+" "+P.phone+" "+P.salary);
    }

    public void main(){

    }
}
