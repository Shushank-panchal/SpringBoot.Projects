package com.student.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.student.entity.Address;
import com.student.model.AddressDTO;

@Component
public class AddressConverter
{
public Address convertToAddressEntity(AddressDTO addressdto)
{
	Address address = new Address();
	if(addressdto!=null)
	{
		BeanUtils.copyProperties(addressdto, address);
	}
	return address;
}
public AddressDTO convertToAddressDTO(Address address)
{
	AddressDTO addressdto = new AddressDTO();
	if(address!=null)
	{
		BeanUtils.copyProperties(address, addressdto);
	}
	return addressdto;
}
}
