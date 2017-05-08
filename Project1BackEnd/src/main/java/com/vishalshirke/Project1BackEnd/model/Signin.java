package com.vishalshirke.Project1BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="newcustomer")
public class Signin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cuid;
	private String cufname;
	private String culname;
	private String cuemail;
	private String cuaddress;
	private int cumob;
	private String cupassword;
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
