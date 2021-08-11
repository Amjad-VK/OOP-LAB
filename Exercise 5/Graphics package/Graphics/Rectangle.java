package Graphics;
interface rectanglefigure
{
void area();
}
public class Rectangle implements rectanglefigure
{
int length,breadth;
public Rectangle(int len,int bre)
{
	length=len;
	breadth=bre;
}
public void area()
{
System.out.println("\nArea of Rectangle");
System.out.println("-----------------");
System.out.println(length*breadth);
}}