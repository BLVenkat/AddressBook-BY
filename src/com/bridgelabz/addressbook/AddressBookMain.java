package com.bridgelabz.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {

		IAddressBookService addressBookService = new AddressBookImp();
		addressBookService.showAddressBook();
		
		//AddressBook addressBook = addressBookService.getAddressByEmail("venkat@gmail.com");
		//System.out.println(addressBook);
		System.err.println("After Removing");
		addressBookService.removeAddress("venkat@gmail.com");
		addressBookService.showAddressBook();
	}
}
