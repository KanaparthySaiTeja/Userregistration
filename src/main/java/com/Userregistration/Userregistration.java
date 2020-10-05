package com.Userregistration;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class UserRegistration {
	
	public static void email(String emailId) {
		String regex = "^[_a-z0-9-\\+]+(\\.[_a-z0-9-]+)*@[a-z0-9]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$";
		if (emailId.matches(regex))
			System.out.println("EmailId is Valid");
		else
			System.out.println("EmailId is Invalid");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EmailId");
		String emailId = sc.nextLine();
		email(emailId);
		sc.close();
	}

}