/*Find the average of N positive integers, raising a user defined exception for each negative input.*/

import java.util.Scanner;

class NegatNumberException extends Exception 
	{
 	public NegatNumberException(String msg)
		{
  		super(msg);
 		}
	}

public class Average
{
 public static void main(String args[])
	{
	int n;
	double sum=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number of elements");
	n=in.nextInt();
	int a[]=new int[n];
	try
		{
	 	System.out.println("Enter "+n+" elements");
	 	for(int i=0;i<n;i++)
			{
		 	a[i]=in.nextInt();
	   	 	if(a[i]<0)
				{
           			throw new NegatNumberException(a[i]+" is negative number,Only positive integers are allowed"); 
				}
			 else
	 			{
	  	 		sum=a[i]+sum;	
				}
			}
		System.out.println("\nAverage="+(sum/n));
		}

	catch(NegatNumberException u)
		{
		u.printStackTrace();                        ///find exact line  raised the exception
		}

	finally
		{
	 	System.out.println("\nThe finally statement is executed");	
		}
	
	}
}
	

/*-----OUTPUT------
E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 6>javac Average.java

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 6>java Average
Enter number of elements
2
Enter 2 elements
5 6

Average=5.5

The finally statement is executed

*/
//Output with exception is needed
