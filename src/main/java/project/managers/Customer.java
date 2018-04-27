package main.java.project.managers;

import java.sql.Date;


public class Customer {
	
	private String SSN; 
	private int accID;
	private String fName;
	private String lName;
	private Date dateJoined; 
	private Date dob; 
	private int stNum;
	private String stName;
	private String city;
	private String states;
	private int zip; 
	private String email; 
	
	public Customer() {
		
		SSN = null; 
		accID = 0;
		fName = null;
		lName = null;
		dateJoined = null;
		dob = null;
		stNum = 0;
		stName = null; 
		city = null;
		states = null;
		zip = 0;
		email = null; 
		
	}
	
	public Customer(String SSN, int accID, String fName, String lName, Date dateJoined,
			Date dob, int stNum, String stName, String city, String states, int zip, String email) {
		
		this.SSN = SSN;
		this.accID = accID;
		this.fName = fName;
		this.lName = lName;
		this.dateJoined = dateJoined;
		this.dob = dob;
		this.stNum = stNum;
		this.stName = stName;
		this.city = city;
		this.states = states; 
		this.zip = zip;
		this.email = email; 
		
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	public int getAccID() {
		return accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Date getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(Date dateJoined) {
		this.dateJoined = dateJoined;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
