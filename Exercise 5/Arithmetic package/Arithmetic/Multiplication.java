package  Arithmetic;
interface mul
{
void mul();
}
  public class Multiplication implements mul
{
int num1,num2;
public Multiplication(int number1,int number2)
{
  num1=number1;
  num2=number2;
}
public void mul()
{
  System.out.println("MULTIPLICATION");
  System.out.println("--------------");
  System.out.println(num1*num2);
}}