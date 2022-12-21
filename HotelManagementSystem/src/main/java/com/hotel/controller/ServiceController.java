package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.ServiceDto;
import com.hotel.entity.Services;
import com.hotel.service.HotelService;
import com.hotel.util.Converter;

@RestController
public class ServiceController {
	@Autowired
	private HotelService hotelservice;
	@Autowired
	private Converter converter;

	@PostMapping("/createService")
	public String createService(@RequestBody ServiceDto serviceDto) {
		final Services service = converter.convertToEntity(serviceDto);
		return hotelservice.createService(service);
	}

	@PutMapping("/updateService/{id}")
	public ServiceDto updateService(@PathVariable("id") int sid, @RequestBody ServiceDto serviceDto) {
		Services service1 = converter.convertToEntity(serviceDto);
		return hotelservice.updateService(sid, service1);
	}

	@GetMapping("/getServices/{identity}")
	public ServiceDto getService(@PathVariable("identity") int sid) {
		// Services service2=converter.convertToEntity(serviceDto);
		return hotelservice.getService(sid);

	}

	@GetMapping("/getAllServices")
	public List<ServiceDto> getAllServices() {
		return hotelservice.getAllServices();
	}

	@DeleteMapping("/deleteServiceById/{id}")
	public String deleteServiceById(@PathVariable("id") int sid) {
		return hotelservice.deleteServiceById(sid);

	}

	@DeleteMapping("/deleteAllServices")
	public void deleteAllServicess() {
		hotelservice.deleteAllServices();

	}

	@GetMapping("/getServiceByCost/{cost}")
	public List<ServiceDto> getServiceByCost(@PathVariable("cost") int serviceCost) {
		return hotelservice.getServiceByCost(serviceCost);
	}

}
