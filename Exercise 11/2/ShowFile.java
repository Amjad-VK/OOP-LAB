// 2.Write a program to write to a file, then read from the file and
// display the contents on the console


import java.io.*;
import java.util.*;
class ShowFile {

	public static void main(String args[]) throws IOException
	{
		int i;
		Scanner sc = new Scanner(System.in);
		FileInputStream fin;
		FileOutputStream f1 = null;
		System.out.println("Menu: \n1.Read a File \n2.Write to a File ");
		System.out.print("Enter your choice : ");
		int ch = sc.nextInt();
		sc.nextLine();
		
			System.out.println("Enter the file name :");
			String file1 = sc.nextLine();

			switch(ch){
			//to read the given file
			case 1:
				
					//creates a file input stream to read from the specified file name
					fin = new FileInputStream(file1);

				// read characters until EOF is encountered
				do {
					//returns the ASCII value of the read byte in integer form
					i = fin.read();
					if(i != -1)
						//read a character with read() and cast the value into a char.
						System.out.print((char) i);

				} while(i != -1);
				fin.close();
				break;
			case 2:
				System.out.println("Enter the String :");
				String str = sc.nextLine();

				//It encodes the String into sequence of bytes
				byte buf[] = str.getBytes();

					//creates a file output stream to write to the specified file name
					f1 = new FileOutputStream(file1);
					f1.write(buf);
				
					f1.close();
					
				break;
			
			}
		
			
	}

}

/*
Menu:
1.Read a File
2.Write to a File
Enter your choice : 2
Enter the file name :
file.txt
Enter the String :
Hi how are you?


Menu:
1.Read a File
2.Write to a File
Enter your choice : 1
Enter the file name :
file.txt
Hi how are you?


*/
