//Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations. Test the package by implementing all operations on two given numbers

import java.util.Scanner;
import Arithmetic.*;
class Arithmetic
{
public static void main(String [] args)
{
int num1,num2;

Scanner sc=new Scanner(System.in);
System.out.println("Arithmetic operation");
System.out.println("--------------------");
System.out.println("Enter the first number");
num1=sc.nextInt();
System.out.println("Enter the second number");
num2=sc.nextInt();

Addition addition=new Addition(num1,num2);
Subtraction subtraction=new Subtraction(num1,num2);
Multiplication multiplication=new Multiplication(num1,num2);
Division division=new Division(num1,num2);

addition.add();
subtraction.sub();
multiplication.mul();
division.div();

}}

/*-------OUTPUT---------
E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 5\Arithmetic package>javac Arithmetic.java

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 5\Arithmetic package>java Arithmetic
Arithmetic operation
--------------------
Enter the first number
5
Enter the second number
5
ADDITION
--------
10
SUBTRACTION
-----------
0
MULTIPLICATION
--------------
25
DIVISION
-----------
1

*/
//Verified
