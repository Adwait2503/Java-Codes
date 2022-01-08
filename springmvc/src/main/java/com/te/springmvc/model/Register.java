package com.te.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name ="Entries")
public class Register {

	private String name;
	@Id
	private String email;
	private Long phNo;
	private String address;
}