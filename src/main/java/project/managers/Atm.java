package main.java.project.managers;

public class Atm {
	
	private int atmID;
	private String branchName;
	private int balance;
	private int maxCash;
	private int stNum;
	private String stName;
	private String city;
	private String state; 
	private int zip; 
	
	public Atm() {
		
		atmID = 0;
		branchName = null;
		balance = 0;
		maxCash = 0;
		stNum = 0;
		stName = null;
		city = null;
		state = null;
		zip = 0; 
		
	}
	
	public Atm(int atmID, String branchID, int balance, int maxCash, 
			int stNum, String stName, String city, String state, int zip) {
		
		this.atmID = atmID;
		this.branchName = branchID;
		this.balance = balance;
		this.maxCash = maxCash;
		this.stNum = stNum;
		this.stName = stName;
		this.city = city;
		this.state = state; 
		this.zip = zip; 
		
	}

	public int getAtmID() {
		return atmID;
	}

	public void setAtmID(int atmID) {
		this.atmID = atmID;
	}

	public String getBranchID() {
		return branchName;
	}

	public void setBranchID(String branchID) {
		this.branchName = branchID;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMaxCash() {
		return maxCash;
	}

	public void setMaxCash(int maxCash) {
		this.maxCash = maxCash;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

}
