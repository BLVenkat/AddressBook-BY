package com.bridgelabz.addressbook;

import java.util.List;

public interface IAddressBookService {

	public static List<AddressBook> add(List<AddressBook> addressBook) {

		addressBook.add(new AddressBook(1, "Venkat", "Reddy", "venkat@gmail.com", "H.no:- 3-64", "Hyderabad",
				"Telangana", "9876543210"));

		addressBook.add(new AddressBook(2, "Aniket", "Chile", "aniket@gmail.com", "H.no:- 5-23", "Pune", "Maharastra",
				"9876543211"));

		addressBook.add(new AddressBook(3, "sunil", "patil", "sunil@gmail.com", "H.no:- 4-47", "mumbai", "Maharastra",
				"9876543212"));

		addressBook.add(new AddressBook(4, "amar", "k", "amar@gmail.com", "H.no:- 2-4/7", "Banglore", "Karnataka",
				"9876543213"));
		return addressBook;
	}
	
	public void showAddressBook();
	
	public AddressBook getAddressByEmail(String emailId);
	
	public void removeAddress(String emailId);
}
