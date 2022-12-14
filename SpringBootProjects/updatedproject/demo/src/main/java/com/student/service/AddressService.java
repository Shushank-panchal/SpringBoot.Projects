package com.student.service;

import java.util.List;

import com.student.entity.Address;
import com.student.model.AddressDTO;

public interface AddressService 
{
	public String createAddress(Address address);

	public AddressDTO updateaddress(int addressid, Address address1);
    public AddressDTO getAddressById(int addressid);
    List<AddressDTO> getAllAddress();
    String deleteAddressById(int id);
    void deleteAllAddress();
}
