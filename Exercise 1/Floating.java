/*Q) Write a Java program to read a floating-point number and if the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
     absolute value of the number is less than 1, or "large" if it exceeds 1,00,000. */

import java.util.Scanner;
class Floating{
               public static void main(String args[]){
               float num;
               System.out.println("Enter a Number:");
               Scanner sc=new Scanner(System.in);
               num=sc.nextFloat();
               if(num==0)
               {
                 System.out.println("The number is Zero");
               }
               else if(num>0)
               {
                if(num<1)
               {
                 System.out.println("The number is small"); 
               }
              else if(num>100000)
               {
                System.out.println("The number is large");
               }
               System.out.println("The number is Positive");
               }
               else
              {
              System.out.println("The number is Negative");
              }
}
}

