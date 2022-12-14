package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Address;
import com.student.model.AddressDTO;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	void save(AddressDTO addressById);

	//void deleteByAddressId(int addressid);
}
