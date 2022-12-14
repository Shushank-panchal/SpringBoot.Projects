package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name ="Student_details")
public class Student {

	@Id //to create primary key
	@GeneratedValue(strategy=javax.persistence.GenerationType.IDENTITY) //generatedvalue
	private int id;
	
	@Column (name ="student_name",nullable=false)
	private String studentname;
	
	@Column (name ="phno",nullable=false)
	private long phno;
	
	@Column (nullable=false)
	private String email;
	
	@OneToOne
	private Address address;
	
}
