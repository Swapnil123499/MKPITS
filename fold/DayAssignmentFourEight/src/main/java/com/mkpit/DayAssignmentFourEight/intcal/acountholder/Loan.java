package com.mkpit.DayAssignmentFourEight.intcal.acountholder;

public  class Loan {
   String accountNumber;
	  double amount;
	int duration;
	public Loan(){
		accountNumber="123456789Swapnil";
		amount=1000;
		duration=1;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	

}
