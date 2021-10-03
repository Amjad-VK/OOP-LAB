/*4. Write a program that reads from a file having integers. Copy even
numbers and odd numbers to separate files.
*/

import java.io.*;
import java.util.*;

class Numbers{
	public static void main(String args[]) throws IOException
	{
		int i;
		char j;
		FileInputStream forg;
		FileOutputStream filevn = null;
		FileOutputStream fileodd = null;
		Scanner sc = new Scanner(System.in);

		

		forg = new FileInputStream("Numbers.txt");
		filevn = new FileOutputStream("Even.txt");
		fileodd = new FileOutputStream("Odd.txt");
		do {
			
			i = forg.read();
			if(i != -1){
				j = (char)i;
				
				if( j % 2 == 0 )
					filevn.write(i);
					
				else 
					fileodd.write(i);
					
			}	

		} while(i != -1);
		forg.close();
	}
}