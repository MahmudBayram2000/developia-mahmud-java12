package PhoneShopping;

public class Main2 {
    public static void main(String[] args) {
        IPhoneService iPhoneService = new IPhoneService();
        SamsungService samsungService = new SamsungService();

        // Adding phones
        IPhone iPhone = new IPhone("iPhone 13", 999.99, true, true, true, 1);
        iPhoneService.addPhone(iPhone);
        System.out.println(iPhone);
        System.out.println();

        IPhone iPhone2 = new IPhone("iPhone 14", 995.99, true, true, true, 5);
        iPhoneService.addPhone(iPhone2);
        System.out.println(iPhone2);
        System.out.println();

        Samsung samsung = new Samsung("Samsung a54",450.55,4,"",true,true);
        samsungService.addPhone(samsung);
        System.out.println(samsung);

        // Deleting phones
        //iPhoneService.deletePhone(1);
        System.out.println();
        System.out.println();


        // Updating phones
        IPhone updatedIPhone = new IPhone("iPhone 13 Pro", 1099.99, true, true, true, 1);
        iPhoneService.updatePhone(1, updatedIPhone);
        System.out.println(updatedIPhone);
    }
}