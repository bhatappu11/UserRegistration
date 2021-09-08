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
		checkMobileNumber();
		checkPassword();
		checkEmailList();
	}

	private static void checkEmailList() {
		pattern = Pattern.compile("([a-zA-Z][a-zA-Z0-9_-]*[a-zA-Z0-9])(([+-_.][a-zA-Z0-9]*)?)(@[a-zA-Z0-9]*)[.]([a-z]{2,})(([.][a-zA-z]{2})?)");
		String[] emails= {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com",
				"abc@gmail.com.com","abc+100@gmail.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com",
				"abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
		for(int i=0;i<emails.length;i++) {	
			matcher = pattern.matcher(emails[i]);
			if(matcher.matches()) {
				System.out.println("Valid"); 
			}
			else {
				System.out.println("Invalid"); 
			}
		}		
	}

	private static void checkPassword() {
		Scanner scanner=new Scanner(System.in);
		pattern = Pattern.compile("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}");
		while(true) {
			System.out.println("Enter the password");
			String password = scanner.nextLine();
			matcher = pattern.matcher(password);
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

	private static void checkMobileNumber() {
		Scanner scanner=new Scanner(System.in);
		pattern = Pattern.compile("^\\d{2}[\\s]\\d{10}");
		while(true) {
			System.out.println("Enter the mobile number");
			String number = scanner.nextLine();
			matcher = pattern.matcher(number);
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
