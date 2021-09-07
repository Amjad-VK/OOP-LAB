/*4. Using generic method perform Bubble sort.
*/

import java.util.*;
import java.util.Arrays;

class BubbleSort{
	public static <T> T[] BSMethod(T[] arr,int n){
		String s1,s2;
		for (int i = 0; i < n-1; i++)   //sorting using bubble sort
        		for (int j = 0; j < n-i-1; j++){
				s1 = arr[j].toString();
				s2 = arr[j+1].toString();
               			if (s1.compareTo(s2)>0)
                		{
                    			// swap arr[j+1] and arr[j]
                    			T temp = arr[j];
                    			arr[j] = arr[j+1];
                    			arr[j+1] = temp;
                		}
			}
		return arr;
	}
}

class Main{
	public static void main(String args[]){
		 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int n = sc.nextInt();
		
		String[] s = new String[n];

		System.out.println("Enter "+n+" elements : ");
		for(int i = 0 ; i < n ; i++)
			s[i] = sc.next();

		BubbleSort b = new BubbleSort();

		s = b.<String>BSMethod(s,n);
		
		System.out.println("After Sorting :");

		for(int i = 0 ; i < n ; i++)
			System.out.println(s[i]);
	}
}

/*
Enter the number of elements : 3
Enter 3 elements :
cat
bat
sat
After Sorting :
bat
cat
sat
*/
Verified
