package main.java.project.managers;

import java.sql.Date;

public class Account {
	
	private int accID;
	private String accType;
	private float balance;
	private Date dateCreated;
	private String fName; 
	private String lName;
	
	public Account() {
		accID = 0;
		accType = null;
		balance = 0;
		dateCreated = null; 
		fName = null; 
		lName = null; 
	}
	
	public Account(int accID, String accType, float balance, Date dateCreated, String name, String lName) {
		this.accID = accID;
		this.accType = accType;
		this.balance = balance;
		this.dateCreated = dateCreated;
		this.fName = name; 
		this.lName = lName; 
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

	public int getAccID() {
		return accID;
	}

	public void setAccID(int accID) {
		this.accID = accID;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


}
