package PhoneShopping;

public class IPhone extends Phone {
    private String model;
    private boolean nfc;
    private boolean faceID;
    private boolean siri;

    public IPhone(String model, double price, boolean nfc, boolean faceID, boolean siri, int id) {
        super("Apple", price, id);
        this.model = model;
        this.nfc = nfc;
        this.faceID = faceID;
        this.siri = siri;
    }

    public IPhone(){}
    public String getModel() {
        return model;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Model: " + model);
        System.out.println("NFC: " + (nfc ? "Yes" : "No"));
        System.out.println("Face ID: " + (faceID ? "Yes" : "No"));
        System.out.println("Siri: " + (siri ? "Yes" : "No"));
    }
}

