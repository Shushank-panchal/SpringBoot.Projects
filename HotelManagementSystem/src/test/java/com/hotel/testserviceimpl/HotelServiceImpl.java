package com.hotel.testserviceimpl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hotel.entity.Customer;
import com.hotel.repository.CustomerRepository;
import com.hotel.service.CustomerService;
import com.hotel.util.CustomerConverter;
@SpringBootTest
public class HotelServiceImpl {
	@Autowired
	private CustomerService userservice;
	@Autowired
	private CustomerConverter customerconverter;
	@MockBean
	private CustomerRepository customerrepository;

	@Test
	void testSaveCustomer() {
		Customer customer = new Customer();
		customer.setName("aditya");
		customer.setPhno(382983819);
		customer.setEmail("aa@gmail.com");
		customer.setPassword("@A12");
		customer.setCountry("india");
		Mockito.when(customerrepository.save(customer)).thenReturn(customer);
		assertThat(userservice.createCustomer(customer)).isEqualTo("customer details saved successfully");
	}
}
