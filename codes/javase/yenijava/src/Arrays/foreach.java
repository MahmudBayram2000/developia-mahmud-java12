package Arrays;

public class foreach {
    public static void main(String[] args) {
        int []ededlerim={10,20,30,40,50};
        for (int ededler:ededlerim) {
            System.out.print(ededler);
            System.out.print(",");
        }
        System.out.println("");
        String[]adlar={"Mahmud","Orxan","Cahid"};
        for (String ad:adlar) {
            System.out.print(ad);
            System.out.print(",");
        }
    }
}
