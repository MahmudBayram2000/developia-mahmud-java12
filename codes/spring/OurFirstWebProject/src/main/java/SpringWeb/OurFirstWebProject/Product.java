package SpringWeb.OurFirstWebProject;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private double cost;
	private double price;
	private String barcode;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime register;
	@Column(unique = true)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
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
	public Product() {
		super();
	}
	
	
	

}
