package SpringWeb.OurFirstWebProject;

import java.time.LocalDateTime;

public class Product {
	
	private Integer id;
	private String name;
	private double cost;
	private double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	private String barcode;
	private LocalDateTime register;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public LocalDateTime getRegister() {
		return register;
	}
	public void setRegister(LocalDateTime register) {
		this.register = register;
	}
	public Product(String name, double cost, double price, String barcode, LocalDateTime register,Integer id) {
		super();
		this.id=id;
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.barcode = barcode;
		this.register = register;
			
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", price=" + price + ", barcode=" + barcode
				+ ", register=" + register + "]";
	}

}
