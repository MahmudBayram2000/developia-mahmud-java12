package PhoneShopping;

import java.util.ArrayList;
import java.util.List;

class IPhoneService implements PhoneService {
    private List<IPhone> iPhones = new ArrayList<>();

    @Override
    public void addPhone(Phone phone) {
        if (phone instanceof IPhone) {
            iPhones.add((IPhone) phone);
            System.out.println("iPhone added successfully.");
        } else {
            System.out.println("Invalid phone type. Cannot add.");
        }
    }

    @Override
    public void updatePhone(int id, Phone phone) {

        for (IPhone iPhone : iPhones) {
            if (iPhone.getId() == id) {

                iPhones.remove(iPhone);
                iPhones.add((IPhone) phone);
                System.out.println("iPhone updated successfully.");
                return;
            }
        }
        System.out.println("iPhone with ID " + id + " not found. Update failed.");
    }

    @Override
    public void deletePhone(int id) {
        for (IPhone iPhone : iPhones) {
            if (iPhone.getId() == id) {
                iPhones.remove(iPhone);
                System.out.println("iPhone with ID " + id + " deleted successfully.");
                return;
            }
        }
        System.out.println("iPhone with ID " + id + " not found. Deletion failed.");
    }
}

