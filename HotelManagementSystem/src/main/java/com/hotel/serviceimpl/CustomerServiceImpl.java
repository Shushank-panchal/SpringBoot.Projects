package com.hotel.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dto.CustomerDto;
import com.hotel.entity.Customer;
import com.hotel.entity.Services;
import com.hotel.exception.ResourceNotFoundException;
import com.hotel.repository.CustomerRepository;
import com.hotel.repository.ServiceRepository;
//import com.hotel.repository.HotelRepository;
//import com.hotel.repository.PaymentDetailsRepository;
import com.hotel.service.CustomerService;
import com.hotel.util.CustomerConverter;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	public CustomerRepository customerrepository;
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	public CustomerConverter customerconverter;

	// @Autowired
	// public HotelRepository hotelrepository;

	// @Autowired
	// public PaymentDetailsRepository paymentdetailsrepository;

	@Override
	public String createCustomer(Customer customer) {
		// String message = null;
		customerrepository.save(customer);
		if (customer != null) {
			return "customer details saved successfully";
		}

		return "errorfound";
	}

	@Override
	public CustomerDto updateCustomer(int cid, Customer customer) {
		Customer existingCustomer = customerrepository.findById(cid)
				.orElseThrow(() -> new ResourceNotFoundException("Customer", "ID", cid));
		existingCustomer.setName(customer.getName());
		existingCustomer.setPhno(customer.getPhno());
		existingCustomer.setEmail(customer.getEmail());
		existingCustomer.setPassword(customer.getPassword());
		existingCustomer.setCountry(customer.getCountry());
		customerrepository.save(existingCustomer);
		return CustomerConverter.convertToCustomerDto(existingCustomer);

	}

	@Override
	public CustomerDto getCustomerById(int cid) {
		Customer getCustomerById = customerrepository.findById(cid).get();
		return CustomerConverter.convertToCustomerDto(getCustomerById);
	}

	@Override
	public List<CustomerDto> getAllCustomers() {
		List<Customer> customers = customerrepository.findAll();
		List<CustomerDto> cdto = new ArrayList<>();
		for (Customer c : customers) {
			cdto.add(CustomerConverter.convertToCustomerDto(c));
		}
		return cdto;
	}

	@Override
	public String deleteCustomerById(int cid) {

		String message = null;
		Optional<Customer> customer = customerrepository.findById(cid);
		if (customer.isPresent()) {
			customerrepository.deleteById(cid);
			message = "customer details delete successfully";
		} else {
			message = "Customer details not found";
		}
		return message;
	}

	@Override
	public void deleteAllCustomers() {
		customerrepository.deleteAll();

	}

	@Override
	public CustomerDto assignServiceToCustomer(int cid, int sid) {
		Customer customer = customerrepository.findById(cid).get();
		Services service = serviceRepository.findById(sid).get();
		customer.setService(service);
		customerrepository.save(customer);
		return CustomerConverter.convertToCustomerDto(customer);
	}
}
