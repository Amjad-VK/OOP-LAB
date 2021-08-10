/*Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface.
 Create a menu driven program to find area and perimeter of objects.*/



import java.util.Scanner;
interface areaperim //interface created
{
  void input();
  void area();
  void perimeter();
}

class Circle implements areaperim
{
    int r=0;
    double pi = 3.14 ,area=0,perimeter=0;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
    }
    public void area()
    {
       area=pi * r * r;
       System.out.print("Area of circle :" +area +"\n");
    }
    public void perimeter()
    {
       perimeter= 2 * pi * r;
       System.out.print("Perimeter of circle :" +perimeter +"\n");
    }
}
class Rectangle implements areaperim
{
    int length=0,breadth=0;
    double area,perimeter;
    public void input()
    {
        Scanner sr = new Scanner(System.in);
        length = sr.nextInt();
        breadth = sr.nextInt();
    }
    public void area()
    {
       area = length * breadth;
       System.out.print("Area of rectangle :" +area +"\n");
    }
    public void perimeter()
    {
       perimeter = 2 * (length+breadth);
       System.out.print("Perimeter of rectangle :" +perimeter +"\n");
    }
}


public class AreaPerimeter
{
  public static void main(String args[])
  {
    int option;
    Circle sc = new Circle();
    Rectangle sr = new Rectangle();
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter your option");
    System.out.println("------------------");
    System.out.println("1.Area of circle");
    System.out.println("2.Area of rectangle");
    System.out.println("3.Perimeter of circle");
    System.out.println("4.Perimeter of rectangle");
    System.out.println("5.Exit");
    
    System.out.print("\nSelect your choice: ");
    option = sn.nextInt();
    while(option!=5)
    {
      switch(option)
      {
         case 1:
               System.out.print("Enter radius of the circle:");
               sc.input();
               sc.area();
               break;
         case 2:
               System.out.print("Enter length and breadth of rectangle:");
               sr.input();
               sr.area();
               break;
        case 3:
               System.out.print("Enter radius of the circle :");
               sc.input();
               sc.perimeter();
               break;
        case 4:
               System.out.print("Enter length and breadth of rectangle:");
               sr.input();
               sr.perimeter();
               break;
        default:
               System.out.print("Invalid option!");
      }
     System.out.print("\nSelect your choice: ");
     option = sn.nextInt();
    }
}
}

/*
E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 5>javac AreaPerimeter.java

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 5>java AreaPerimeter
Enter your option
------------------
1.Area of circle
2.Area of rectangle
3.Perimeter of circle
4.Perimeter of rectangle
5.Exit

Select your choice: 1
Enter radius of the circle:6
Area of circle :113.03999999999999

Select your choice: 2
Enter length and breadth of rectangle:5 6
Area of rectangle :30.0

Select your choice: 5

*/