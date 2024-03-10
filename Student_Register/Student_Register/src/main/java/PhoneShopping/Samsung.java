package PhoneShopping;

public class Samsung extends Phone{
    private String model;
    private boolean fingerprint;
    private boolean fastCharging;

    public Samsung(String brand, double price, int id, String model, boolean fingerprint, boolean fastCharging) {
        super(brand, price, id);
        this.model = model;
        this.fingerprint = fingerprint;
        this.fastCharging = fastCharging;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Model: " + model);
        System.out.println("Fingerprint: " + (fingerprint ? "Yes" : "No"));
        System.out.println("Fast Charging: " + (fastCharging ? "Yes" : "No"));
    }
}

