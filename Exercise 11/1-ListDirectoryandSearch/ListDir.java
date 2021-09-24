/*1. Program to list the sub directories and files in a given directory and also search for a file name.*/



import java.io.File;
import java.util.Scanner;
class ListDir{
    public static void main(String[] args){
        String Dirname="java";
        File f1=new File(Dirname);
        if(f1.isDirectory()){
			System.out.println("Directory Name:" +  Dirname);
			String[] files = f1.list();
			
			System.out.println("\n********Sub directories & files in " + Dirname + "*******");
			for(int i=0; i< files.length; i++ ){
				System.out.println(files[i]);
			}
			
			Scanner sc  = new Scanner(System.in);
			System.out.print("\nEnter the file name to search: ");
			String fn = sc.nextLine();
			
			for(int i=0; i< files.length; i++ ){
				if(files[i].equals(fn)){
					System.out.println(fn + " found ");
					return;
				}
			}
			System.out.println(fn + " not found ");
			
		} else {
			System.out.println(Dirname + " is not a directory");
		}
	}
}
    
/*

********Sub directories & files in java*******
Calculator.class
Calculator.java
CalculatorOUTPUT.png
Output
Programs

Enter the file name to search: CalculatorOUTPUT.png
CalculatorOUTPUT.png found

*/