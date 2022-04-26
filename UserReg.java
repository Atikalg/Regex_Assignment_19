package com.bl.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author atik
 *	Validation of user data
 * added password  validation Rule1
 */
public class UserReg {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UserReg userReg = new UserReg();
		//function call
		userReg.checkFirstName();
		userReg.checkLastName();
		userReg.checkEmail();
		userReg.checkMobileNo();
		userReg.checkPassword();
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
		if(Pattern.matches("^[a-zA-Z]+([.][a-zA-Z0-9]+)*[@][a-z]+[.][a-z]{2,3}([.][a-z]{2})?$",email)){
			System.out.println("Email is valid");
		}
		else {
			System.out.println("Email is invalid");
		}
	}
	//validating mobile number
	public void checkMobileNo() {
		System.out.println("Enter Phone No : ");
		String mobileNo = sc.nextLine();
		if( Pattern.matches("[0-9]{2}+[ ][0-9]{10}$",mobileNo)){
			System.out.println("Mobile Number is valid");
		}
		else {
			System.out.println("Mobile Number invalid");
		}
	}
	//Validating Password
	public void checkPassword() {
		System.out.println("Enter Password : ");
		String password = sc.nextLine();
		if(Pattern.matches("^[a-zA-Z0-9+-_!@#$%^&*().]{8,}",password)){
			System.out.println("password is valid");
		}
		else {
			System.out.println("password is invalid");
		}
	}

}
