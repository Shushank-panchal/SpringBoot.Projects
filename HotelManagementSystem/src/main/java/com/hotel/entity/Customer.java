package com.hotel.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Table(name = "Customer")

// Object relational Model of Customer entity
public class Customer {

	@Id // to create primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;

	@Column(name = "customer_name", nullable = false)
	private String name;

	@Column(name = "phone_number", nullable = false)
	private long phno;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "country")
	private String country;

	// @OneToOne
	// private Services service;
	@OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private Services service;

	@Builder
	public Customer(String name, long phno, String email, String password, String country) {
		super();
		this.name = name;
		this.phno = phno;
		this.email = email;
		this.password = password;
		this.country = country;
	}

}
