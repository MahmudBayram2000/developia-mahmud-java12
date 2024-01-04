package com.example.Spring.Student;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="Students")
public class StudentEntity { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;// db

	@NotNull(message = "Ad mutleqdir")
	@NotEmpty(message = "Adi bos qoymaq olmaz")
	@Size(min = 2, message = "Ad minimum 2 simvol olmalidir")
	@Size(max = 50, message = "Ad maksimum 50 simvol olmalidir")
	private String name;// user

	@NotNull(message = "Soyad mutleqdir")
	private String surname ; // user

	@NotNull(message = "Address mutleqdir")
	private String address;;// user
	@Column(unique = true)

	@NotNull(message = "telefon nomresi mutleqdir")
	@NotEmpty(message = "telefon nomresini bos qoymaq olmaz")

	// @Pattern(regexp = "[0-9a-zA-Z]{3}-[0-9]{3}",message = "hdashjksd") // 565-965
	private String phone; // user
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime register;

 
	
	private String owner;
	

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDateTime getRegister() {
		return register;
	}

	public void setRegister(LocalDateTime register) {
		this.register = register;
	}

	public StudentEntity(Integer id, String name, String surname, String address, String phone, LocalDateTime register) {
		super();
		System.out.println("ok");
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phone = phone;
		this.register = register;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", address=" + address + ", phone=" + phone
				+ ", register=" + register + "]";
	}

	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

	 

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}


