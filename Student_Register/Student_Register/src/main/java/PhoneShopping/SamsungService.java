package PhoneShopping;

import java.util.ArrayList;
import java.util.List;

class SamsungService implements PhoneService {
    private List<Samsung> samsungs = new ArrayList<>();

    @Override
    public void addPhone(Phone phone) {
        if (phone instanceof Samsung) {
            samsungs.add((Samsung) phone);
            System.out.println("Samsung phone added successfully.");
        } else {
            System.out.println("Invalid phone type. Cannot add.");
        }
    }

    @Override
    public void updatePhone(int id, Phone phone) {
        for (Samsung samsung : samsungs) {
            if (samsung.getId() == id) {
                samsungs.remove(samsung);
                samsungs.add((Samsung) phone);
                System.out.println("Samsung phone updated successfully.");
                return;
            }
        }
        System.out.println("Samsung phone with ID " + id + " not found. Update failed.");
    }

    @Override
    public void deletePhone(int id) {
        for (Samsung samsung : samsungs) {
            if (samsung.getId() == id) {
                samsungs.remove(samsung);
                System.out.println("Samsung phone with ID " + id + " deleted successfully.");
                return;
            }
        }
        System.out.println("Samsung phone with ID " + id + " not found. Deletion failed.");
    }
}

