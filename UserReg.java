package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UserReg userReg = new UserReg();
		//function call
		userReg.checkFirstName();
		userReg.checkLastName();
		userReg.checkEmail();
	}
	//validating first name  of user
	public void checkFirstName() {
		System.out.println("Enter first name start with Capital letter :");
		String firstName = sc.nextLine();
		if( Pattern.matches("^[A-Z]{1}[a-z]{2,}",firstName) ){
			System.out.println("first name is valid");
		}
		else {
			System.out.println("first name invalid");
		}
	}
	//validating last name 
	public void checkLastName() {
		System.out.println("Enter Last name start with Capital letter : ");
		String lastName = sc.nextLine();
		if(Pattern.matches("^[A-Z]{1}[a-z]{2,}",lastName)) {
			System.out.println("Last name is valid");
		}
		else {
			System.out.println("Last name invalid");
		}
	}
	//validating email 
	public void checkEmail() {
		System.out.println("Enter Email : ");
		String email = sc.nextLine();
		if(Pattern.matches("^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*[@][a-z]+[.][a-z]{2,3}([.][a-z]{2})?$",email)){
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Email is invalid");
		}
	}

}
