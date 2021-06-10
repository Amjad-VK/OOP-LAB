/*2. Program to create a class for Emply having attributes eNo, eName eSalary. Read n
employ information and Search for an employee given eNo, using the concept of Array of
Objects.
              */

import java.util.Scanner;
class Emply{
	int eNo;
	String eName;
	int eSalary;
	Emply(int eNo,String eName,int eSalary)
		{
		this.eNo = eNo;
		this.eName = eName;
		this.eSalary = eSalary;
		}
	}
class Employee{
public static void main(String args[]){
	int n,en,salary,b;
	String name;


      	Scanner s = new Scanner(System.in);


	System.out.print("\nEnter number of employees:");                         	//to enter the no of employee you want
         	n = s.nextInt();
	System.out.print("\n--------------------");

	Emply a[] = new Emply[n];							//create object (array) for class Emply 
	for(int i=0;i<n;i++)								//use for loop for entering n employee details
	{
	   
	   System.out.print("\nEnter the Eno:");
	   en = s.nextInt();
	   System.out.print("Enter employee name:");
	   name = s.next();	
	   System.out.print("Enter the salary of employee:");
	   salary = s.nextInt();
	   System.out.print("-------------------------------------");
            
   	    a[i] = new Emply(en,name,salary);                                      	//store ech employee details in each index postion of array
	}
	
  	System.out.print("\nEnter the Employee you want to search:");            
         	b = s.nextInt();
  	

	int f=0;	
	for(int i=0;i<n;i++)								//for loop for cheking eno of each array index				
	{
	  if(a[i].eNo==b)
	  {
		System.out.print("Found employee, having "+b);                         	
    		f=1;
		break;
	   }
       	}



	if(f==0)
	  {
		System.out.print("Not found"); 
          }


	
    }
}
	  
	



/*
Enter number of employees:2

--------------------
Enter the Eno:01
Enter employee name:Ram
Enter the salary of employee:19999
-------------------------------------
Enter the Eno:02
Enter employee name:Raj
Enter the salary of employee:25999
-------------------------------------
Enter the Employee you want to search:02
Found employee, having 2

*/