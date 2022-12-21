package com.hotel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.hotel.dto.CustomerDto;
import com.hotel.entity.Customer;

@Component
public class CustomerConverter {
	// converting customer to customerdto
	public Customer convertToEntity(CustomerDto customerdto) {
		Customer customer = new Customer();
		if (customerdto != null) {
			BeanUtils.copyProperties(customerdto, customer);
		}
		return customer;
	}

//coverting customerdto to customer
	public static CustomerDto convertToCustomerDto(Customer customer) {
		CustomerDto customerdto = new CustomerDto();
		if (customer != null) {
			BeanUtils.copyProperties(customer, customerdto);
		}
		return customerdto;

	}
}
