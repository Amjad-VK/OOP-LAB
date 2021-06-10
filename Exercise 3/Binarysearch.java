/*1. Write a program to search an element in an array using

b. Simple binary search
c. Recursive binary search
d. Using Arrays .binarySearch ( )     */

import java.util.Scanner;
import java.util.Arrays;

public class Binarysearch{
	public static int simpleBS(int arr[],int first,int last,int key){
		int mid=(first+last)/2;
		while(first<=last){
			if(arr[mid]<key)
				first=mid+1;
			else if(arr[mid]==key)
				return mid;
			else last=mid-1;
			mid=(first+last)/2;
		}
		return -1;
	}
	public static int recursiveBS(int arr[],int first,int last,int key){
		if(last>=first){
			int mid=(first+last)/2;
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				return recursiveBS(arr,first,mid-1,key);	
			else return recursiveBS(arr,mid+1,last,key);
		}
		return -1;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int opt,n,k,f=-1;
		
		
			System.out.println("-------------------------------");
			System.out.println("1.Simple Binary Search");
			System.out.println("2.Recursive Binary Search");
			System.out.println("3.Using Arrays.binarySearch()");
			System.out.print("Enter your choice : ");
			opt=sc.nextInt();
			System.out.print("Enter number of elements : ");
			n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter "+n+" number of elements : ");
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			System.out.println("Array in sorted order :");
			for(int a:arr)
				System.out.print(a+" ");
			System.out.println();
			System.out.println("Enter the value to be searched : ");
			k=sc.nextInt();
		
		
			switch(opt){
				case 1: f=simpleBS(arr,0,n,k);
			        	break;
				case 2: f=recursiveBS(arr,0,n,k);
			        	break;
				case 3: f=Arrays.binarySearch(arr,k);
					break;
				default:System.out.println("Invalid output");
					break;
			}
			if(f>=0) System.out.println("Element found at index : "+f);
			else System.out.println("Element not found");
                        
			
		
	}
}
/*
-------------------------------
1.Simple Binary Search
2.Recursive Binary Search
3.Using Arrays.binarySearch()
Enter your choice : 1
Enter number of elements : 3
Enter 3 number of elements :
4 8 4
Array in sorted order :
4 4 8
Enter the value to be searched :
8
Element found at index : 2


----------------------------
-------------------------------
1.Simple Binary Search
2.Recursive Binary Search
3.Using Arrays.binarySearch()
Enter your choice : 2
Enter number of elements : 4
Enter 4 number of elements :
5 4 8 1
Array in sorted order :
1 4 5 8
Enter the value to be searched :
4
Element found at index : 1

-------------------------------
1.Simple Binary Search
2.Recursive Binary Search
3.Using Arrays.binarySearch()
Enter your choice : 3
Enter number of elements : 5
Enter 5 number of elements :
4 5 8 9 2
Array in sorted order :
2 4 5 8 9
Enter the value to be searched :
5
Element found at index : 2

*/		