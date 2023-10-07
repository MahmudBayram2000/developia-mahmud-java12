package HomeworkFromMaths;

public class math {
    public static void main(String[] args) {
        double a=52;
        System.out.println(Math.sqrt(a)); //kokaltinin tapilmasi

        double b=5;
        double c=2;
        System.out.println(Math.pow(b,c));

        double d=2.363636;
        System.out.println(Math.round(d)); //normal yuvarlasdirma
        String result=String.format("%.2f",d); //formatla yuvarlasdirma
        System.out.println(result);
    }
}
