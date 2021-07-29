package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public List<AddressBookView> trasformAddressBook() {
		return addressBook.stream().map(address -> new AddressBookView(address.getId(), 
				                                                       address.getFirstName(),
				                                                       address.getEmail(),
				                                                       address.getAddress()))
		                           .collect(Collectors.toList());
						
//		return addressBook.stream().map(address -> {
//			AddressBookView addressView = new AddressBookView();
//			addressView.setId(address.getId());
//			addressView.setFirstName(address.getFirstName());
//			addressView.setEmail(address.getEmail());
//			addressView.setAddress(address.getAddress());
//			return addressView;
//		}).collect(Collectors.toList());
	}

	@Override
	public List<AddressBookView> sortOnFirstName(List<AddressBookView> addressBookView) {
		return addressBookView.stream().sorted(Comparator.comparing(AddressBookView::getFirstName)) 
		                        .collect(Collectors.toList());
	}

	@Override
	public void showAddressBookView(List<AddressBookView> addressView) {
		addressView.forEach(address ->{
			System.out.println(address);
		});
	}

	@Override
	public List<AddressBookView> customSort(List<AddressBookView> addressBookView) {
		return addressBookView.stream().sorted((a,b) ->{
			if(a.getId() == b.getId()) 
				return a.getFirstName().compareTo(b.getFirstName());
			
			else if(a.getId()>b.getId())
					return 1;
			
			return -1;
			
		}).collect(Collectors.toList());
	}
	

}
