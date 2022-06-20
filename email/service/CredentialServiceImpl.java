package com.greatlearning.email.service;

import java.util.Random;

import com.greatlearning.email.model.Employee;

public class CredentialServiceImpl implements CredentialService 
{

	String email;
	char[] generatedPassword;
	@Override
	public String generateEmailAddress(Employee emp, String department) 
	{
		// TODO Auto-generated method stub
		return emp.getFirstName()+emp.getLastName()+"@"+department+".greatlearning.com";
	}

	@Override
	public char[] generatePassword() 
	{
		// TODO Auto-generated method stub
				Random random = new Random();
				String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String smallLetters="abcdefghijklmnopqrstuvwxyz";
				String numbers ="0123456789";
				String specialCharacters="!@#$%^&**()_+<>?.,";
				String values= capitalLetters+smallLetters+numbers+specialCharacters;
				char[] password = new char[8];
				for (int i=0; i<8;i++)
				{
					password[i]=values.charAt(random.nextInt(values.length()));
				}
				
				return password;
	}

	@Override
	public void showCredential(Employee emp, String email, char[] generatedPassword)
	{
		System.out.println("Dear "+emp.getFirstName()+" "+emp.getLastName());
		System.out.println("Your generated credentials are as follows");
		System.out.println("Email -->"+email);
		System.out.print("Password -->"+"");
		System.out.print(generatedPassword);
		
		
	}

	}
