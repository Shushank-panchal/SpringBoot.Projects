package com.hotel.service;

import java.util.List;

import com.hotel.dto.CustomerDto;
import com.hotel.entity.Customer;

public interface CustomerService {
	public String createCustomer(Customer customer);

	public CustomerDto updateCustomer(int cid, Customer customer);

	public CustomerDto getCustomerById(int cid);

	public List<CustomerDto> getAllCustomers();

	String deleteCustomerById(int cid);

	void deleteAllCustomers();

	CustomerDto assignServiceToCustomer(int cid, int sid);
}
