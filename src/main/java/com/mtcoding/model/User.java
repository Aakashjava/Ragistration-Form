package com.mtcoding.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registrationform")

public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String registrationNumber;
	    private String name;
	    private String designation;
	    private String phoneNumber;
	    private String email;
	    private String address;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getRegistrationNumber() {
			return registrationNumber;
		}
		public void setRegistrationNumber(String registrationNumber) {
			this.registrationNumber = registrationNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", registrationNumber=" + registrationNumber + ", name=" + name + ", designation="
					+ designation + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
					+ ", getId()=" + getId() + ", getRegistrationNumber()=" + getRegistrationNumber() + ", getName()="
					+ getName() + ", getDesignation()=" + getDesignation() + ", getPhoneNumber()=" + getPhoneNumber()
					+ ", getEmail()=" + getEmail() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
		
		
	    // getters and setters
	}



