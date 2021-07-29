package com.bridgelabz.addressbook;

import java.util.List;

public class AddressBookMain {

	public static void main(String[] args) {

		IAddressBookService addressBookService = new AddressBookImp();
		//addressBookService.showAddressBook();
		
		//AddressBook addressBook = addressBookService.getAddressByEmail("venkat@gmail.com");
		//System.out.println(addressBook);
		//System.err.println("After Removing");
		//addressBookService.removeAddress("venkat@gmail.com");
		//addressBookService.showAddressBook();
		List<AddressBookView> addressView = addressBookService.trasformAddressBook();
		addressBookService.showAddressBookView(addressView);
		
		List<AddressBookView> sortedOnFirstName = addressBookService.customSort(addressView);
		System.out.println("stored based on first name");
		addressBookService.showAddressBookView(sortedOnFirstName);
	}
}
