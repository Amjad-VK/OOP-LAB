package Graphics;
interface squarefigure
{
void area();
}
public class Square implements squarefigure
{
int side;
public Square(int s)
{
	side=s;
}
public void area()
{
System.out.println("\nArea of Square");
System.out.println("--------------");
System.out.println(side*side);
}}