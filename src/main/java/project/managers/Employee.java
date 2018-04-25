package main.java.project.managers;

import java.sql.Date;

public class Employee {
	
	private int empID;
	private int SSN;
	private String fName;
	private String lName;
	private String stNum;
	private String stName;
	private String city;
	private String states;
	private int zip; 
	
	public Employee() {
		
		empID = 0;
		SSN = 0;
		fName = null;
		lName = null;
		stNum = null;
		stName = null;
		city = null;
		states = null;
		zip = 0; 
	}
	
	public Employee(int empID, int SSN, String fName,
			String lName, String stName,String stNum, String city, 
			String states, int zip) {
		
		this.empID = empID;
		this.SSN = SSN;
		this.fName = fName;
		this.lName = lName;
		this.stNum = stNum; 
		this.stName = stName;
		this.city = city;
		this.states = states;
		this.zip = zip; 
	
	}

	
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
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
	
	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
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


}
