package com.vishalshirke.Project1BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	private int custid;
	private String custfnnm;
	private String custlnm;
	private String custemail;
	private String custaddress;
	private int custmob;
	private String custpassw;
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustfnnm() {
		return custfnnm;
	}
	public void setCustfnnm(String custfnnm) {
		this.custfnnm = custfnnm;
	}
	public String getCustlnm() {
		return custlnm;
	}
	public void setCustlnm(String custlnm) {
		this.custlnm = custlnm;
	}
	public String getCustemail() {
		return custemail;
	}
	public void setCustemail(String custemail) {
		this.custemail = custemail;
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public int getCustmob() {
		return custmob;
	}
	public void setCustmob(int custmob) {
		this.custmob = custmob;
	}
	public String getCustpassw() {
		return custpassw;
	}
	public void setCustpassw(String custpassw) {
		this.custpassw = custpassw;
	}
	
	
	
}
