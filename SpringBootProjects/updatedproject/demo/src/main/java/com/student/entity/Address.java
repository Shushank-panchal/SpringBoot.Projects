package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="student_address")
public class Address
{
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	
private int addressId;
	
@Column(length = 50,nullable = false)
private String city;

@Column(length = 30,nullable = false)
private String state;

@Column(length = 10,nullable = false)
private int pincode;


}
