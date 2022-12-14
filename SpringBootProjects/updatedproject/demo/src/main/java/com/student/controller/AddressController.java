package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Address;
import com.student.model.AddressDTO;
import com.student.service.AddressService;
import com.student.util.AddressConverter;

@RestController
@RequestMapping("/api")
public class AddressController {
@Autowired
public AddressService addressservice;

@Autowired
public AddressConverter addressconverter;

@PostMapping("/createAddress")
public String createAddress(@RequestBody AddressDTO addressdto)
{
	final Address address = addressconverter.convertToAddressEntity(addressdto);
	return addressservice.createAddress(address);
}
@PostMapping("/updateAddress/{identity}")
public AddressDTO updateAddress(@PathVariable("identity") int addressid, @RequestBody AddressDTO addressdto)
{
	Address address1=addressconverter.convertToAddressEntity(addressdto);
	return addressservice.updateaddress(addressid, address1);
}
@GetMapping("/getAddressById/{identity}")
public AddressDTO getAddressById(@PathVariable("identity") int addressid)
  {
  	//Student student2=converter.convertToStudentDTO(studentdto);
  return addressservice.getAddressById(addressid);
  }
@GetMapping("/getAllAddress")
public List<AddressDTO> getAllAddress()
{
	return addressservice.getAllAddress();
}
@DeleteMapping("/deleteAddressById/{addressid}")
public String deleteAddressById(@PathVariable("addressid") int addressid)
{
	return addressservice.deleteAddressById(addressid);
}
@DeleteMapping("/deleteAllAddress")
public void deleteAllAddresses() {
	addressservice.deleteAllAddress();
}
}
