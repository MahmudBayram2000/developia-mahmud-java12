package StringBuilder;

public class StringBuilderCodes {
    public static void main(String[] args) {

        StringBuilder str=new StringBuilder("Mahmud Bayramov");
        str.append("Mahmud"); //yeni deyer eleave edir
        str.insert(0,"Orxan"); //yeni setiri indekse elave etmek ucun
        str.replace(0,7,"Orxan"); // deyisidirmek
        str.delete(0,7); //silmek
        str.reverse();  //tersini yazmaq
        System.out.println(str.capacity()); //tutumu qaytarir
        str.ensureCapacity(25); //obyekt tutumunu qaytrair
        System.out.println(str);
        StringBuilder str2=new StringBuilder("Bayramov");
        str2.ensureCapacity(28);
        System.out.println(str2);
        //str.append("Orxan Hacizade");
        char c=str.charAt(12);
        System.out.println(c);
        System.out.println(str.length());  //uzunlugunu tapir

        System.out.println(str.substring(0,6)); //alt setirini tapmaq


    }
}
