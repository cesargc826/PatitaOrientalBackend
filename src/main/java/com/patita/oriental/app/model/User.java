package com.patita.oriental.app.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
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
	
	/*@Column(name = "created_at", nullable = false, updatable = false)
	private LocalDateTime createdAt;
	@Column(name = "updated_at", nullable = false)
	private LocalDateTime updatedAt;*/
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_role")
    private Role role;
	
	@Column(name = "is_active", nullable = false)
	private boolean isActive;
	
	//=============== Relacion muachos a muchos para crear la tabla Favoritos ==================================
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable( 
			name="favorites", 
			joinColumns = @JoinColumn(name = "id_user"),
			inverseJoinColumns = @JoinColumn(name = "id_product")
			
			)
	private Set<Product> favorites = new HashSet<>();
	
	public User(){
		
	}

	public User(Long id, String name, String lastName, String email, String phoneNumber, String address,
			String postalCode, String password, String imageUrl, 
			boolean isActive, Role role, Set<Product> favorites) {
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
		this.role = role;
		this.favorites = favorites;
	} 

	public Set<Product> getFavorites() {
		return favorites;
	}

	public void setFavorites(Set<Product> favorites) {
		this.favorites = favorites;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
	
	/*public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}*/

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
		/*builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append(", updatedAt=");
		builder.append(updatedAt);*/
		builder.append(", isActive=");
		builder.append(isActive);
		builder.append("]");
		return builder.toString();
	}
	
	// Métodos de ayuda para sincronizar la relación bidireccional con Menu
    public void addFavorite(Product favorites) {
        this.favorites.add(favorites);
    }
    public void removeFavorites(Product favorites) {
        this.favorites.remove(favorites);
    }
}
