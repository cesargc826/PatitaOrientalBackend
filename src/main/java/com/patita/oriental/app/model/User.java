package com.patita.oriental.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false, length = 70)
	private String name;
	
	@Column(name = "last_name", nullable = false, length = 100)
	private String lastName;
	
	@Column(name = "email", nullable = false, length = 70)
	private String email;
	
	@Column(name = "phone_number", nullable = false, length = 30)
	private String phoneNumber;
	
	@Column(name = "address", nullable = false, length = 250)
	private String address;
	
	@Column(name = "postal_code", nullable = false, length = 5)
	private String postalCode;
	
	@Column(name = "password", nullable = false, length = 120)
	private String password;
	
	@Column(name = "image_url", nullable = false, length = 100)
	private String imageUrl;
	
	@Column(name = "is_active", nullable = false)
	private boolean isActive;
	
	public User(){
		
	}

	public User(Long id, String name, String lastName, String email, String phoneNumber, String address,
			String postalCode, String password, String imageUrl, boolean isActive) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.postalCode = postalCode;
		this.password = password;
		this.imageUrl = imageUrl;
		this.isActive = isActive;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", address=");
		builder.append(address);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", password=");
		builder.append(password);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append(", isActive=");
		builder.append(isActive);
		builder.append("]");
		return builder.toString();
	}
	
	
}
