
package bankaccount;

import java.util.Random;

public class BankAccount {
	//member variables
	public double checkingBalance;
	public double savingsBalance;
	//static variables
	private static int totalAccounts = 0;
	private static int totalAccountBalances = 0;

	//constructors
	public BankAccount (double checkingBalanceParam, double savingsBalanceParam) {
		this.checkingBalance = checkingBalanceParam;
		this.savingsBalance = savingsBalanceParam;
		totalAccounts+=1;
		totalAccountBalances++;	
	}
	
	public BankAccount() {
		this.checkingBalance = 0;
		this.savingsBalance = 0;
	}
	
	//Generate Random Bank Account Numbers
	
	//Checking Accounts
	public double getCheckingBalance() {
		return checkingBalance;
	}


	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}


	//Savings Accounts
	public double getSavingsBalance() {
		return savingsBalance;
	}


	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	//Total Accounts
	public static int getTotalAccounts() {
		return totalAccounts;
	}


	public static void setTotalAccounts(int totalAccounts) {
		BankAccount.totalAccounts = totalAccounts;
	}


	//Account Balances
	public static int getTotalAccountBalances() {
		return totalAccountBalances;
	}


	public static void setTotalAccountBalances(int totalAccountBalances) {
		BankAccount.totalAccountBalances = totalAccountBalances;
	}
	
	//Deposits 
	public void makeDeposits(double depositAmount, String accountType) {
		if (accountType == "savings" ) {
			this.savingsBalance += depositAmount;
		} else if(accountType =="checkings") {
			this.checkingBalance += depositAmount;	
		} else {
			System.out.println("The information required to make a deposit is incorrect.");	
		}
	}
	
	//Withdrawals
	public void makeWithdrawals(double withdrawalAmount, String accountType) {
		if (accountType == "savings" && this.savingsBalance > withdrawalAmount) {
			this.savingsBalance -= withdrawalAmount; 
		} else if (accountType == "checkings" && this.checkingBalance > withdrawalAmount) {
			this.checkingBalance -= withdrawalAmount;
		} else {
			System.out.println("Insufficent Funds.");	
		}
	}
	
	//AccountTotals
	public void displayUserAccountTotals () {
		String info = String.format("User Checking Account Total:%d \nUser Savings Account: ", this.checkingBalance, this.savingsBalance);
		System.out.println(info);
		
	}
}
	
