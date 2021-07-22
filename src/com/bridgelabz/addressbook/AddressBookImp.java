package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookImp implements IAddressBookService {

	List<AddressBook> addressBook;

	public AddressBookImp() {
		addressBook = new ArrayList<AddressBook>();
		addressBook = IAddressBookService.add(addressBook);
	}

	@Override
	public void showAddressBook() {
		addressBook.forEach(System.out::println);
	}

	@Override
	public AddressBook getAddressByEmail(String emailId) {
		
		
//		Optional<AddressBook> isAddressPresent = addressBook.stream()
//				                          .filter(address -> address.getEmail().equals(emailId))
//				                          .findAny();
//		if(isAddressPresent.isPresent()) 
//			return isAddressPresent;	
//		return new AddressBook();
		
	               return addressBook.stream()
                          .filter(address -> address.getEmail().equals(emailId))
                          .findAny().orElse(new AddressBook());
		
	
		
	}

	@Override
	public void removeAddress(String emailId) {
		AddressBook addressBook = getAddressByEmail(emailId);
		if(addressBook.getEmail() !=null) {
			this.addressBook.remove(addressBook);
		}	
	}
	
	

}
