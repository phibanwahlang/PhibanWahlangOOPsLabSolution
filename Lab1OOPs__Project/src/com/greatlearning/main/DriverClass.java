package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass {
public static void main(String[] args) {
	
	Employee employee = new Employee("Harshit","Choudary");
	CredentialService cs = new CredentialService();
	String generatedEmail;
	char[] generatedPassword;
	System.out.println("Enter the Department");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");
	Scanner sc = new Scanner(System.in);
	int option=sc.nextInt();
	if(option == 1)
	{
		generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "Technical");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
	else if(option == 2)
	{
		generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "Admin");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
	else if(option == 3) 
	{
		generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "Human Resource");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
	else if(option == 4)
	{
		generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "Legal");
		generatedPassword=cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
	}
	sc.close();
}
}
