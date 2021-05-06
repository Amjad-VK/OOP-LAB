// Q) Write a program in Java to display the cube of the number upto given an integer.

import java.util.Scanner;
class Cube{
       public static void main(String args[]){
       int num,cube;
System.out.println("Enter an Integer");
Scanner no=new Scanner(System.in);
num=no.nextInt();
System.out.println("The cube upto given integer "+num+" is");
for(int i=1;i<=num;i++)
{
cube=i*i*i;
System.out.println(cube);
}
}
}



/*------OUTPUT----------
Enter an Integer
6
The cube upto given integer 6 is
1
8
27
64
125
216


*/