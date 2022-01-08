package com.te.hibernate.hibernate1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DesiDaru {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Brand")
	private String name;
	private double price;
	@Column(nullable = false)
	private String qty;
	
}
