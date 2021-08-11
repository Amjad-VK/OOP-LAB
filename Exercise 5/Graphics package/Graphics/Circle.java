package Graphics;
interface circlefigure
{
void area();
}
public class Circle implements circlefigure
{
double radius;
double pi=3.14;
public Circle(double rad)
{
	radius=rad;
}
public void area()
{
System.out.println("\nArea of Circle");
System.out.println("--------------");
System.out.println(pi*radius*radius);
}}