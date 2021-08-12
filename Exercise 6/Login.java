/*Write a user defined exception class to authenticate
the user name and password.*/


import java.util.*;
class UsernameException extends Exception
	{
	public UsernameException(String msg)
		{
		super(msg);
		}
	}

class PassException extends Exception
	{
	public PassException(String msg)
		{
		super(msg);
		} 
	}

public class Login
	{
	public static void main(String [] args)
		{	
		Scanner in=new Scanner(System.in);
		String uname,pass;

 		System.out.println("\nUSERNAME   :");
		uname=in.nextLine();
		System.out.println("\nPASSWORD    :");
		pass=in.nextLine();

		int length=uname.length();
		
		try
			{
			if(length<6)
			throw new UsernameException("\nUsername must be greater than 6 characters!");
			
			else if(!pass.equals("Welcome"))
			throw new PassException("\nIncorrect password !");
	
			else
			System.out.println("\nYou have Login Succesfully...");
			}

		catch(UsernameException u)
			{
			u.printStackTrace();   ///find exact line  raised the exception
			}
		catch(PassException p)
			{
			p.printStackTrace();    //find exact line  raised the exception
			}
		finally
			{
			System.out.println("\nThe Finally statement is executed");
			}
		}
	}


/*
E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 6>javac Login.java

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 6>java Login

USERNAME   :
Amjad

PASSWORD    :
4458
UsernameException:
Username must be greater than 6 characters!
        at Login.main(Login.java:39)

The Finally statement is executed
*/