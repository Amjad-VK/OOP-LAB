/* 3. Write a menu driven program that would choose either in-built method or call a user defined method to sort an
 array of strings.*/

import java.util.Scanner;
import java.util.Arrays;
class StringSort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of string : ");
		int n=sc.nextInt();
		String arr[]=new String[n+1];
		System.out.println("Enter a string :");
		for(int i=0;i<=n;i++)
			arr[i]=sc.nextLine();
		System.out.println("Choice:");
		System.out.println("1. Built-in method");
		System.out.println("2. User defined method");
		System.out.println("Enter your choice : ");
		int ch=sc.nextInt();
		switch(ch){
			case 1: Arrays.sort(arr); //builtin method to sort array
				break;
			case 2: for (int i = 0; i < n; i++)   //sorting using bubble sort
            				for (int j = 0; j < n-i; j++)
                				if (arr[j].compareTo(arr[j+1])>0)
                				{
                    					// swap arr[j+1] and arr[j]
                    					String temp = arr[j];
                    					arr[j] = arr[j+1];
                    					arr[j+1] = temp;
                				}
				break;
			default:System.out.println("Invalid");
				break;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
/*
> Enter number of Strings : 3

> Enter Strings :
How
Zebra
Cat

>>>>>>>>>>>>> SORT >>>>>>>>>

 1 : USER DEFINED

 2 : BUILT-IN

 3 : EXIT

>>>>>>>>>>>>>>>>>>>>>>>>>>>>


 >> Choice : 1

 >> Original Array :  'How' 'Zebra' 'Cat'

-------------------------------------------

 >> Sorted Array   :  'Cat' 'How' 'Zebra'

-------------------------------------------

*/		