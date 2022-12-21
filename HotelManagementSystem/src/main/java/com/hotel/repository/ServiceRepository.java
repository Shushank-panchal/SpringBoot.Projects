package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hotel.entity.Services;

public interface ServiceRepository extends JpaRepository<Services, Integer> {

	@Query("from Services where lower(serviceCost) like :s%")
	List<Services> getServiceByCost(@Param("s") int serviceCost);

}
