package com.EmployeeInfo.javaBank;

public class EmployeeInformation {

	private int accountNumber;

	private static double balance;

	private String customerName;

	private String email;

	private Phone phone;

	public EmployeeInformation() {

	}

	public EmployeeInformation(int accountNumber, String customerName, String email, double amount, Phone phone) {

		this.accountNumber = accountNumber;

		this.customerName = customerName;
		this.email = email;
		balance = amount;
		this.phone = phone;
	}

	public double depfunds(double amount) {
		return balance += amount;
	}

	public double withdraw(double amount) {

		if (balance < amount) {
			System.out.println("Not Enough Balance for" + customerName + "Which is " + balance);
		}

		else {

			return balance - amount;
		}

		return balance;
	}

	int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance( double balance) {
		EmployeeInformation.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName="
				+ customerName + ", email=" + email + ", phone=" + phone + "]";
	}

}
