package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String specialCharacter = "!@#$%^&*<>_|";

		String values = capitalLetters + smallLetters + number + specialCharacter;

		Random random = new Random();

		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + lastName + "@" + department + ".abc.com";
	}

	public void showCredentials(Employee employee, String email, char[] generatePassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows:");
		System.out.println("Email--->" + email);
		System.out.print("Password--->");
		System.out.println(generatePassword);
	}
}
