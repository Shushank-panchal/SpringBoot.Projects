package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.CustomerDto;
import com.hotel.entity.Customer;
import com.hotel.service.CustomerService;
import com.hotel.util.CustomerConverter;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired(required = true)
	public CustomerService userservice;

	@Autowired
	public CustomerConverter customerconverter;

	@PostMapping("/createCustomer")
	public String createCustomer(@RequestBody CustomerDto customerdto) {
		final Customer customer = customerconverter.convertToEntity(customerdto);
		return userservice.createCustomer(customer);

	}

	@PutMapping("/updateCustomer/{identity}")
	public CustomerDto updateCustomer(@PathVariable("identity") int cid, @RequestBody CustomerDto customerdto) {
		Customer customer = customerconverter.convertToEntity(customerdto);
		return userservice.updateCustomer(cid, customer);
	}

	@GetMapping("/getCustomerByID/{identity}")
	public CustomerDto getCustomerById(@PathVariable("identity") int cid) {

		return userservice.getCustomerById(cid);
	}

	@DeleteMapping("/deleteCustomerById/{id}")
	public String deleteStudentById(@PathVariable("id") int cid) {
		return userservice.deleteCustomerById(cid);

	}

	@DeleteMapping("/deleteAllCustomers")
	public void deleteAllCustomers() {
		userservice.deleteAllCustomers();
	}

	@PostMapping("/assignServiceToCustomer/{customerId}/{serviceId}")
	public CustomerDto assignServiceToCustomer(@PathVariable("customerId") int cid,
			@PathVariable("serviceId") int sid) {
		return userservice.assignServiceToCustomer(cid, sid);
	}
}
