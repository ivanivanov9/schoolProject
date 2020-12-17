package tema19;

import java.util.Date;

public class Account19 {
	
	private int id = 0;
	protected double balance = 0;
	private double yearInterestRate = 0;
	private Date dateOfCreation = new Date();

	Account19() {
		
	}
	
    Account19(int id, double balance){
    	this.setId(id);
    	this.setBalance(balance);
	}
    
    public int getId() {
    	return id;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    
    public double getBalance() {
    	return balance;
    }
    
    public void setBalance(double balance) {
    	this.balance = balance;
    }
    
    public double getYearInterestRate() {
    	return yearInterestRate;
    }
    
    public void setYearInterestRate(double aYearInterestRate) {
    	yearInterestRate = aYearInterestRate;
    }
    
    public Date getDateOfCreation() {
    	return dateOfCreation;
    }
    
    public double getMonthlyInterestRate() {
    	return yearInterestRate / 12;
    }
    
    public double getMonthlyInterest() {
    	return balance * yearInterestRate / 12 / 100;
    }
    
    public void withdraw(double draw) {
    	balance -= draw;
    }
    
    public void deposit(double sum) {
    	balance += sum;
    }
    
    public String toString() {
    	return "Balance " + balance;
    }

}