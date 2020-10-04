package com.Userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class Userregistration
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println( "Hello" );
      firstName();
      lastName();
    }
    //UC1 Valid first name
    public static void firstName() {
		System.out.println("Enter First Name");
		String fN = sc.nextLine();
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true)
			System.out.println("Valid First Name");
		else
			System.out.println("Invalid First Name");
	}
 // UC2 - Last name starts with Cap and has minimum 3 characters
 	public static void lastName() {
 		System.out.println("Enter Last Name");
 		String lN = sc.nextLine();
 		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true)
 			System.out.println("Valid Last Name");
 		else
 			System.out.println("Invalid Last Name");
 	}
}
