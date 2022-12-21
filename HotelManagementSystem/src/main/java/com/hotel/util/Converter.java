package com.hotel.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.hotel.dto.ServiceDto;
import com.hotel.entity.Services;



@Component
public class Converter {

	public Services convertToEntity(ServiceDto serviceDto)
	{
		Services service = new Services();
		if(serviceDto!=null)
		{
			BeanUtils.copyProperties(serviceDto, service);
		}
		return service;
	}
	
	public ServiceDto  convertToServiceDto(Services service)
	{  
	   ServiceDto serviceDto=new ServiceDto();
	   if(service!=null)
	   {
		   BeanUtils.copyProperties(service, serviceDto);
	   }
		return serviceDto;
	}
}
