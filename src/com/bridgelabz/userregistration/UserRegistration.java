package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static Pattern pattern;
	static Matcher matcher;
	public static void main(String[] args) {
		checkFirstName();
		checkLastName();
		checkEmail();
	}

	private static void checkEmail() {
		Scanner scanner=new Scanner(System.in);
		pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9])(([+-_.][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]*)[.]([a-z]{2,})(([.][a-zA-z]{2})?)");
		while(true) {
			System.out.println("Enter the email");
			String email = scanner.next();
			matcher = pattern.matcher(email);
			if(matcher.matches()) {
				System.out.println("Valid"); 
				break;
			}
			else {
				System.out.println("Invalid"); 
				continue;
			}
		}
	}

	private static void checkLastName() {
		Scanner scanner=new Scanner(System.in);
		pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
		while(true) {
			System.out.println("Enter the last name");
			String lastName = scanner.next();
			matcher = pattern.matcher(lastName);
			if(matcher.matches()) {
				System.out.println("Valid"); 
				break;
			}
			else {
				System.out.println("Invalid"); 
				continue;
			}
		}
	}

	private static void checkFirstName() {
		Scanner scanner=new Scanner(System.in);
		pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
		while(true) {
			System.out.println("Enter the first name");
			String firstName = scanner.nextLine();
			matcher = pattern.matcher(firstName);
			if(matcher.matches()) {
				System.out.println("Valid"); 
				break;
			}
			else {
				System.out.println("Invalid"); 
				continue;
			}
		}
	}

}
