package com.bridgelabz.addressbook;

public class AddressBookView {

	private int id;
	private String firstName;
	private String email;
	private String address;
	
	
	
	public AddressBookView(int id, String firstName, String email, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.email = email;
		this.address = address;
	}
	
	
	
	public AddressBookView() {
		super();
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
		return "AddressBookView [id=" + id + ", firstName=" + firstName + ", email=" + email + ", address=" + address
				+ "]";
	}
	
	
}
