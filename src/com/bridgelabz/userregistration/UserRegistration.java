package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		checkFirstName();
	}

	private static void checkFirstName() {
		Scanner scanner=new Scanner(System.in);
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		while(true) {
			System.out.println("Enter the first name");
			String firstName = scanner.nextLine();
			Matcher matcher = pattern.matcher(firstName);
			if(matcher.matches()) {
				System.out.println("Valid"); 
				break;
			}
			else {
				System.out.println("Invalid"); 
				continue;
			}
		}
		scanner.close();
	}

}
