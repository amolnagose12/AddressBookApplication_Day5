package com.bridgelabz.addressbook.service;

import java.util.List;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;



public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();

	AddressBookData getAddressByPinCode(int pinCode);

	AddressBookData createAddressBookData(AddressBookDTO addressbookDTO);

	AddressBookData updateAddressBookData(int pinCode, AddressBookDTO addressbookdto);

	void deleteAddressBookData(int pinCode);

	
}