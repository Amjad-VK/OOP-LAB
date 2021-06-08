/*1. Define a class ‘product’ with data members pcode, pname and price. Create 3
objects of the class and find the product having the lowest price.*/

import java.util.Scanner;

class Product{ 
  
 int pcode ,price; 
 String pname;

 Product(int pc , String pn , int pr) 
 {
   pcode=pc;
   pname=pn;
   price=pr;
    
 }
}

class Productmain               //Main Class
{
public static void main(String args[]){
 
 

  Product P1 = new Product(01,"Ink",56);
  
   System.out.println("product name  : "+ P1.pname); 
   System.out.println("product code  : "+ P1.pcode);
   System.out.println("product price : "+ P1.price);   

   int pcode ,price; // data members
   String pname;

   pcode=02;
   price=12;
   pname="Scale";
  
 Product P2 =new Product(pcode,pname,price);



   System.out.println("product name  : "+ P2.pname); 
   System.out.println("product code  : "+ P2.pcode);
   System.out.println("product price : "+ P2.price); 


    Scanner in = new Scanner(System.in);
 
    System.out.print("ENTER PRODUCT NAME : ");
    pname = in.next();
 
 System.out.print("ENTER PRODUCT PCODE : ");
 pcode = in.nextInt();
 
 System.out.print("ENTER PRODUCT PRICE : ");
 price = in.nextInt();
 
 Product P3 =new Product(pcode,pname,price);

   System.out.println("product name  : "+ P3.pname); 
   System.out.println("product code  : "+ P3.pcode);
   System.out.println("product price : "+ P3.price); 


  System.out.println("-----------PRODUCT WITH LOWEST PRICE----------");


 if(P1.price < P2.price && P1.price < P3.price){
    System.out.println("product name : "+ P1.pname);
    System.out.println("product code  : "+ P1.pcode);
    System.out.println("product price : "+ P1.price);
   }
 else if( P2.price < P1.price && P2.price < P3.price ){
 
    System.out.println("product name : "+ P2.pname);
    System.out.println("product code  : "+ P2.pcode);
    System.out.println("product price : "+ P2.price); 
 }
 else{
     System.out.println("product name : "+ P3.pname);
     System.out.println("product code  : "+ P3.pcode);
     System.out.println("product price : "+ P3.price);    
 } 
  

}
}


/*--------------OUTPUT-------------------------------------------------
product name  : Ink
product code  : 1
product price : 56
product name  : Scale
product code  : 2
product price : 12
ENTER PRODUCT NAME : Pot  
ENTER PRODUCT PCODE : 3
ENTER PRODUCT PRICE : 69
product name  : Pot
product code  : 3
product price : 69
-----------PRODUCT WITH LOWEST PRICE----------
product name : Scale
product code  : 2
product price : 12



----------------------------------------------------------------------------*/




