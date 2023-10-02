package StringPool;

public class matches {
    public static void main(String[] args) {
        String phone="055";
        String phone1="055-888-4444";
        String phone2="0558884444";
        String pattern="[0-8]{3}-[0-8]{3}-[0-8]{4}";
        System.out.println(phone1.matches(pattern));
        System.out.println(phone.matches(pattern));
        System.out.println(phone2.matches(pattern));
    }
}
