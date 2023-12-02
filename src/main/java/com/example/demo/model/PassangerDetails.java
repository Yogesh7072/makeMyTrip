package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PassangerDetails {
	@Id
	private int pid;
	private String pname;
	private String password;

	@Column(unique = true)
	private String gmailId;
	@Column(unique = true)
	private String mobileNumber;

}
