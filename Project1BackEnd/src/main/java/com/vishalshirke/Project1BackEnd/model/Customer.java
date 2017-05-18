package com.vishalshirke.Project1BackEnd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CustomerDetails")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cust_id")
	private int cuid;
	
	@Column(name="cust_fname")
	private String cufname;
	
	@Column(name="cust_lname")
	private String culname;
	
	@Column(name="cust_email")
	private String cuemail;
	
	@Lob
	@Column(name="cust_address")
	private String cuaddress;
	
	@Column(name="cust_jdate")
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	
	@Column(name="cust_mob")
	private int cumob;
	
	@Column(name="cust_passw")
	private String cupassword;
	
	
	// we can have two types of primary keys
	// 1. Natural : which is in the bussiness use and has a unique value e.g-
	// Login ID
	// 2.Surrogate key : which hass no bussiness logic but we use it as a
	// primary key for storing data eg:- userid,1,2,3,4..like that

	// @Lob (Large Object) is used when the dats is more or long in size and
	// exceeding the varchar size.
	
	
	public int getCuid() {
		return cuid;
	}

	public void setCuid(int cuid) {
		this.cuid = cuid;
	}

	public String getCufname() {
		return cufname;
	}

	public void setCufname(String cufname) {
		this.cufname = cufname;
	}

	public String getCulname() {
		return culname;
	}

	public void setCulname(String culname) {
		this.culname = culname;
	}

	public String getCuemail() {
		return cuemail;
	}

	public void setCuemail(String cuemail) {
		this.cuemail = cuemail;
	}

	public String getCuaddress() {
		return cuaddress;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public void setCuaddress(String cuaddress) {
		this.cuaddress = cuaddress;
	}

	public int getCumob() {
		return cumob;
	}

	public void setCumob(int cumob) {
		this.cumob = cumob;
	}

	public String getCupassword() {
		return cupassword;
	}

	public void setCupassword(String cupassword) {
		this.cupassword = cupassword;
	}

}
