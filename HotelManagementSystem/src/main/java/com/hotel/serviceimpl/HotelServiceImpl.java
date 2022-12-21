package com.hotel.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dto.ServiceDto;
import com.hotel.entity.Services;
import com.hotel.repository.ServiceRepository;
import com.hotel.service.HotelService;
import com.hotel.util.Converter;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	private Converter converter;

	@Override
	public String createService(Services service) {
		String message = null;
		serviceRepository.save(service);
		if (service != null) {
			message = "services have saved";
		}
		return message;
	}

	@Override
	public ServiceDto updateService(int sid, Services service1) {
		Services existingService = serviceRepository.findById(sid).get();
		existingService.setServiceCost(service1.getServiceCost());
		existingService.setPick(service1.getPick());
		existingService.setSpa(service1.getSpa());
		existingService.setSports(service1.getSports());
		existingService.setFooType(service1.getFooType());
		existingService.setActivities(service1.getActivities());
		existingService.setFeedback(service1.getFeedback());
		existingService.setRating(service1.getRating());
		existingService.setSuggestion(service1.getSuggestion());
		serviceRepository.save(existingService);
		return converter.convertToServiceDto(existingService);

	}

	@Override
	public ServiceDto getService(int sid) {
		Services getService = serviceRepository.findById(sid).get();

		// studentRepository.save(getStudent);
		return converter.convertToServiceDto(getService);
	}

	@Override
	public List<ServiceDto> getAllServices() {
		List<Services> services = serviceRepository.findAll();
		List<ServiceDto> sDTO = new ArrayList<>();
		for (Services s : services) {
			sDTO.add(converter.convertToServiceDto(s));
		}
		return sDTO;
	}

	@Override
	public String deleteServiceById(int sid) {
		String message = null;
		Optional<Services> service = serviceRepository.findById(sid);
		if (service.isPresent()) {
			serviceRepository.deleteById(sid);
			message = "service delete successfully";
		} else {
			message = "Service not found";
		}
		return message;
	}

	@Override
	public void deleteAllServices() {
		serviceRepository.deleteAll();

	}

	@Override
	public List<ServiceDto> getServiceByCost(int serviceCost) {
		List<Services> services = serviceRepository.getServiceByCost(serviceCost);
		List<ServiceDto> serviceDTO = new ArrayList<>();
		for (Services s : services) {
			serviceDTO.add(converter.convertToServiceDto(s));
		}
		return serviceDTO;

	}

}
