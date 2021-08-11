package Arithmetic;
interface add
{
  void add();
}
public class Addition implements add
{
  int num1,num2;
  public Addition(int number1,int number2)
{
  num1=number1;
  num2=number2;
}
public void add()
{
  System.out.println("ADDITION");
  System.out.println("--------");
  System.out.println(num1+num2);
}}