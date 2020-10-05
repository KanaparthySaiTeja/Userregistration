package com.Userregistration;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class UserRegistration {
	
	
	public static void mobileNumber(String number) {
		String regex = "^[0-9]{2}\\s[0-9]{10}$";
		if (number.matches(regex))
			System.out.println("Mobile Number is Valid");
		else
			System.out.println("Mobile Number is Invalid");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile number");
		String number = sc.nextLine();
		mobileNumber(number);
		sc.close();
	}

}