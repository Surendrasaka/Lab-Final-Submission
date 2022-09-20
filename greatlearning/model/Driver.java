package org.greatlearning.model;

import java.util.Scanner;

public class Driver 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		Employee e = new Employee("Surendra", "Saka");
		CredentialService credentialService = new CredentialService();
		int choice;
		do
		{
			System.out.println("Please Enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			choice=sc.nextInt();
			switch (choice)
			{
			case 1:
				String email = credentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
				char[] password = credentialService.generatePassword();
				credentialService.showCredentials(e, email, password);
				break;
				
			case 2:
				String email2 = credentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "admin");
				char[] password2 = credentialService.generatePassword();
				credentialService.showCredentials(e, email2, password2);
				break;
				
			case 3:
				String email3 = credentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "humanresourse");
				char[] password3 = credentialService.generatePassword();
				credentialService.showCredentials(e, email3, password3);
				break;
				
			case 4:
				String email4 = credentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "legal");
				char[] password4 = credentialService.generatePassword();
				credentialService.showCredentials(e, email4, password4);
				break;

		default:
			System.out.println("Please enter from 1 to 4 only");
			
			break;
			}
		}
		while (choice<=4);
		
	}

}
