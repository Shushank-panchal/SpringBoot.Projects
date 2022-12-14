package com.student.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Address;
import com.student.model.AddressDTO;
import com.student.repository.AddressRepository;
import com.student.service.AddressService;
import com.student.util.AddressConverter;


@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressRepository addressrepository;
	
	 @Autowired
	 private AddressConverter addressconverter;
	
	@Override
	public String createAddress(Address address) {
		String message = null;
		addressrepository.save(address);
		if(address!=null)
		{
			message = "Address details saved successfully";
		}
		else
		{
			message="address was not saved";
		}
		return message;
	}

	@Override
	public AddressDTO updateaddress(int addressid, Address address1) {
		Address existingAddress = addressrepository.findById(addressid).get();
		existingAddress.setCity(address1.getCity());
		existingAddress.setState(address1.getState());
		existingAddress.setPincode(address1.getPincode());
		
		addressrepository.save(existingAddress);
		return addressconverter.convertToAddressDTO(existingAddress);
	}

	@Override
	public AddressDTO getAddressById(int addressid) {
	Address getAddressById= addressrepository.findById(addressid).get();
		   //studentrepository.save(getStudentById(1));
			return addressconverter.convertToAddressDTO(getAddressById);
	
	}

	@Override
	public List<AddressDTO> getAllAddress() {
		List<Address> addresses= addressrepository.findAll();
		List<AddressDTO> adto= new ArrayList<>();
		for(Address a:addresses)
		{
			adto.add(addressconverter.convertToAddressDTO(a));
		}
		return adto;
	}

	@Override
	public String deleteAddressById(int addressid) {
		 String message= null;
    	 Optional<Address> address=addressrepository.findById(addressid);
    	 if(address.isPresent())
    	 {
    		 addressrepository.deleteById(addressid);
    		 message="Address details delete successfully";
    	 }
    	 else
    	 {
    		 message="Address details not found";
    	 }
    	 return message;
		
	}

	@Override
	public void deleteAllAddress() {
		addressrepository.deleteAll();
		
	}

}
