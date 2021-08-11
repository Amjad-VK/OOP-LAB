package Arithmetic;
interface div
{
void div();
}
public class Division implements div
{
int num1,num2;
public Division(int number1,int number2)
{
  num1=number1;
  num2=number2;
}
public void div()
{
  System.out.println("DIVISION");
  System.out.println("-----------");
  System.out.println(num1/num2);
}}