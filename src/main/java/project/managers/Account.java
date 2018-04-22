package main.java.project.managers;

import java.sql.Date;

public class Account {
	
	private int accID;
	private String accType;
	private float balance;
	private Date dateCreated;
	
	public Account() {
		accID = 0;
		accType = null;
		balance = 0;
		dateCreated = null; 
	}
	
	public Account(int accID, String accType, float balance, Date dateCreated) {
		this.accID = accID;
		this.accType = accType;
		this.balance = balance;
		this.dateCreated = dateCreated;
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
