package com.hotel.service;

import java.util.List;

import com.hotel.dto.ServiceDto;
import com.hotel.entity.Services;

public interface HotelService {

	String createService(Services service);

	ServiceDto updateService(int sid, Services service1);

	ServiceDto getService(int sid);

	List<ServiceDto> getAllServices();

	String deleteServiceById(int sid);

	void deleteAllServices();

	List<ServiceDto> getServiceByCost(int serviceCost);

}
