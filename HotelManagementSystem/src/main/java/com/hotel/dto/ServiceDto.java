package com.hotel.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceDto {

	private int sid;
	@NotNull
	private int serviceCost;
	@NotNull
	private String pick;
	@NotNull
	private String spa;
	@NotNull
	private String sports;
	@NotNull
	private String fooType;
	@NotNull
	private String activities;
	@Size(min = 1, max = 5)
	private int rating;
	@Size(max = 50)
	private String feedback;
	@Size(max = 50)
	private String suggestion;
	@NotNull
	private String customername;
	@NotNull
	private String paymentdate;

	private String facility;
	@NotNull
	private int roomno;
	@NotNull
	private int totalamount;
}
