package com.bl.regex;

import java.util.Scanner;

public class UserReg {

	public static void main(String[] args) {
		System.out.println("Enter a user name");
		Scanner sc = new Scanner(System.in);
		System.out.println(firstName(sc.nextLine()));
		boolean result = firstName("Atik");
		if(result) {
			System.out.println("User name is valid");
		}
		else {
			System.out.println("User name is invalid");
		}
	}
	
	public static boolean firstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

}
