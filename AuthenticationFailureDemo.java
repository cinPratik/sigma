/**
11) Write a program to accept the password from user and throw
‘AuthenticationFailure’ exception if the password is incorrect.
*/

import java.util.Scanner;

class AuthenticationFailure extends Exception
{
 
	 public AuthenticationFailure(String str) 
	{
 	 System.out.println(str);
	}
}

public class AuthenticationFailureDemo 
{
	
	public static void main(String[] args)
	{
 		int pass=0;
		int password=0;
 	 	Scanner s = new Scanner(System.in);
  		System.out.print("Please enter your password: ");
 		try
		{
			pass = s.nextInt();
  			password=123456;
		}
		catch(Exception e)
		{
			System.out.println(e);
	     	System.out.print("Hint:your password contain only numbers: ");
		}
  		try 
		{
   			if(pass!=password) 
   			throw new AuthenticationFailure("Invalid password");
   			else
    			System.out.println("Valid password");
  		}
  		catch (AuthenticationFailure e)
		{
   			System.out.println(e);
  		}
 	}
}