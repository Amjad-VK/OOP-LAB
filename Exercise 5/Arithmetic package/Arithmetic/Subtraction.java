package  Arithmetic;
interface sub
{
void sub();
}
  public class Subtraction implements sub
{
int num1,num2;
public Subtraction(int number1,int number2)
{
  num1=number1;
  num2=number2;
}
public void sub()
{
  System.out.println("SUBTRACTION");
  System.out.println("-----------");
  System.out.println(num1-num2);
}}