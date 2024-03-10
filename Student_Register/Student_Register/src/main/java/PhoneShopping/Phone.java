package PhoneShopping;

public class Phone {

    private String brand;
    private double price;

    private int id;

    public Phone(String brand, double price,int id) {
        this.brand = brand;
        this.price = price;
        this.id = id;
    }

    public Phone(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Id:"+ id);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }
    @Override
    public String toString() {
        return "ID: " + id + "\nBrand: " + brand + "\nPrice: $" + price;
    }
}

