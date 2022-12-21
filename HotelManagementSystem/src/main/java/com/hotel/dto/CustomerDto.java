package com.hotel.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {

	private int id;
	private String email;
	private String name;
	private long phno;
	@NotNull
	@Size(max = 10)
	private String password;
	@Size(min = 1, max = 10)
	private String country;
}
