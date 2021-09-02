package BankAccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private Double checkingBalance = 0.0;
	private Double savingsBalance = 0.0;
	public static int numberOfAccounts = 0;
	public static Double totalMoney = 0.0;
	
	public BankAccount() {
		generateNewAccountNumber();
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	private String generateNewAccountNumber(){
	    String numbers = "0123456789";
	    String newAccountNumber = "";

	    Random rand = new Random();

	    for (int i = 0; i < 5; i++){
	        int num = numbers.charAt(rand.nextInt(10));
	        newAccountNumber += num; 
	    }
	    
	    accountNumber = newAccountNumber; 

	    return newAccountNumber;
	}
	public void setCheckingBalance(double checkingBalance){
	    this.checkingBalance = checkingBalance;
	}
	public double getCheckingBalance(){
	    System.out.println("The checking balance for this account is : $" + this.checkingBalance);
	    return this.checkingBalance;
	}
	public void setSavingsBalance(double savingsBalance){
	    this.savingsBalance = savingsBalance;
	}
	
	public double getSavingsBalance(){
	    System.out.println("The savings balance for this account is : $" + this.savingsBalance);
	    return this.savingsBalance;

	}
	public void depositChecking(double checkingBalance) {
		this.setCheckingBalance(checkingBalance);
		totalMoney = totalMoney + checkingBalance;
	}
	public void depositSaving(double savingsBalance) {
		this.setSavingsBalance(savingsBalance);
		totalMoney += savingsBalance;
	}
	public double total() {
		totalMoney = savingsBalance + checkingBalance;
		return totalMoney;
	
	}
	public void withdrawalChecking(int amount) {
		if(getCheckingBalance() < Double.valueOf(amount)){
			System.out.println("you dont have enough money");
		}
		else {
			setCheckingBalance(getCheckingBalance() - Double.valueOf(amount));
		}
	}
	public void withdrawalSavings(int amount) {
		if(getSavingsBalance()< Double.valueOf(amount)) {
			System.out.println("Bro u aint have money mmy dude");
		}
		else {
			setSavingsBalance(getSavingsBalance()- Double.valueOf(amount));
		}
	}
}
