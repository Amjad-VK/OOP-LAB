//Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square and Circle. Test the package by finding the area of these figures.

import Graphics.*;
import java.util.Scanner;
class Figure
{
public static void main(String [] args)
{
int length,breadth,side,base,height,radius;
Scanner sc=new Scanner(System.in);
System.out.println("RECTANGLE");
System.out.println("---------");
System.out.println("Enter the length of rectangle:");
length=sc.nextInt();
System.out.println("Enter the breadth of rectangle:");
breadth=sc.nextInt();
Rectangle rectangle=new Rectangle(length,breadth);

System.out.println("\nSQUARE");
System.out.println("------");
System.out.println("Enter the side of square:");
side=sc.nextInt();
Square square=new Square(side);

System.out.println("\nCIRCLE");
System.out.println("------");
System.out.println("Enter the radius of circle");
radius=sc.nextInt();
Circle circle=new Circle(radius);

System.out.println("\nTRIANGLE");
System.out.println("--------");
System.out.println("Enter the height of rectangle");
height=sc.nextInt();
System.out.println("Enter the base of rectangle");
base=sc.nextInt();
Triangle triangle=new Triangle(height,base);

rectangle.area();
square.area();
circle.area();
triangle.area();


}}

/*----OUTPUT------

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 5\package_graphics>javac Figure.java

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 5\package_graphics>java Figure
RECTANGLE
---------
Enter the length of rectangle:
5
Enter the breadth of rectangle:
6

SQUARE
------
Enter the side of square:
5

CIRCLE
------
Enter the radius of circle
9

TRIANGLE
--------
Enter the height of rectangle
8
Enter the base of rectangle
4

Area of Rectangle
-----------------
30

Area of Square
--------------
25

Area of Circle
--------------
254.34

Area of Triangle
----------------
16.0

*/
