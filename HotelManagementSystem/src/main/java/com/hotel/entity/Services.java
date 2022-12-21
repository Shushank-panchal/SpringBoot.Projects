package com.hotel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
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
@Table(name = "service")
@SecondaryTable(name = "customer_review", pkJoinColumns = @PrimaryKeyJoinColumn(name = "Services_id"))
@SecondaryTable(name = "payment_details", pkJoinColumns = @PrimaryKeyJoinColumn(name = "services_id"))
public class Services {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

	@Column(name = "service_cost")
	private int serviceCost;
	@Column(name = "picking")
	private String pick;

	@Column(name = "spa")
	private String spa;

	@Column(name = "sports")
	private String sports;

	@Column(name = "food_type")
	private String fooType;

	@Column(name = "Activity")
	private String activities;

	// mapping customer_review with services
	@Column(table = "customer_review")
	private int rating;

	@Column(table = "customer_review")
	private String feedback;

	@Column(table = "customer_review")
	private String suggestion;

	// mapping payment_details with services
	@Column(table = "payment_details")
	private String customername;

	@Column(table = "payment_details")
	private String paymentdate;

	@Column(table = "payment_details")
	private String facility;

	@Column(table = "payment_details")
	private int roomno;

	@Column(table = "payment_details")
	private int totalamount;

}
