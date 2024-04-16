package com.lightbits.userlogin.model;

public class User {

	private String firstname;
	private String lastname;
	private String email;
	private String passwd;
	private String dob;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstname, String lastname, String email, String passwd, String dob) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.passwd = passwd;
		this.dob = dob;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", passwd=" + passwd
				+ ", dob=" + dob + "]";
	}
	
	
}
