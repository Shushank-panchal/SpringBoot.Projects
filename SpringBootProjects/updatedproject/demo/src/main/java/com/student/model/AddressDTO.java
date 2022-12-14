package com.student.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDTO {
     
	private int addressId;
	@NotNull
	@Size(min=1)
	private String city;
	@NotNull
	@Size(min=1)
	private String state;
	@NotNull
	@Size(min=1, max=10)
	private int pincode;

}
