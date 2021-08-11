package Graphics;
interface trianglefigure
{
void area();
}
public class Triangle implements trianglefigure
{
int base;
int height;
public Triangle(int b,int h)
{
	base=b;
        height=h;
}
public void area()
{
System.out.println("\nArea of Triangle");
System.out.println("----------------");
System.out.println(.5*base*height);
}}