package com.EmployeeInfo.javaBank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Customer Information
		System.out.println("Enter Customer Information");

		System.out.println("Enter Customer name:- ");

		String name = input.next();

		System.out.println("Enter Account Number");

		int accountNumber = input.nextInt();
		
		System.out.println("Enter the balance");
		double balance= input.nextDouble();

		System.out.println("Enter your Email");

		String email = input.next();

		// Employee Phone Information

		System.out.println("Employee phone id");
		int phoneId = input.nextInt();

		System.out.println("Enter Area code");
		String areaCode = input.next();

		System.out.println("Enter Phone Number");
		String number = input.next();

		System.out.println("Enter Country Code");
		String countryCode = input.next();

		Phone phone = new Phone(phoneId, areaCode, number, countryCode);

		EmployeeInformation emp = new EmployeeInformation(accountNumber, name, email,balance, phone);

		System.out.println(emp);
		
		//Enter deposite or withdraw
		
		System.out.println("Enter Amount for deposite");
		double depAmount= input.nextDouble();
		
		double receiveBalance=emp.depfunds(depAmount);
		
		System.out.println(receiveBalance);
		
		System.out.println("Enter amount for WithDraw");
		double wdamount=input.nextDouble();
		
		System.out.println(emp.withdraw(wdamount));
		
		
		
	}

}
