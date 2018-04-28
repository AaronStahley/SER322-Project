package main.java.project.managers;

import java.sql.Date;

public class Employee {
	
	private int empID;
	private String SSN;
	private String fName;
	private String lName;
	private int stNum;
	private String stName;
	private String city;
	private String states;
	private int zip; 
	private String email;
	private String position;
	private String branchName; 
	
	public Employee() {
		
		empID = 0;
		SSN = null;
		fName = null;
		lName = null;
		stNum = 0;
		stName = null;
		city = null;
		states = null;
		zip = 0; 
		email = null; 
		position = null;
		branchName = null; 
	}
	
	public Employee(int empID, String SSN, String fName,
			String lName, int stNum,String stName, String city, 
			String states, int zip, String email, String position, String branchName) {
		
		this.empID = empID;
		this.SSN = SSN;
		this.fName = fName;
		this.lName = lName;
		this.stNum = stNum; 
		this.stName = stName;
		this.city = city;
		this.states = states;
		this.zip = zip; 
		this.email = email;
		this.position = position;
		this.branchName = branchName; 
	
	}

	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
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
