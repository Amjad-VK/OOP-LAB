/*2)Prepare bill with the given format using calculate method from interface.
Order No.
Date:
---------------------------------------------------
Product Id     Name   Quantity   Unit_Price  Total
---------------------------------------------------
101              A        2         25        50
102              B        1         100       100
---------------------------------------------------
Net.Amount 150*/

//-----------------------------------------------------------------------------------------------------------------------------------------------------------


import java.util.*;
interface BillGen
{
  int calculate();
}
class ProductB implements BillGen
{
  String name;
  int product_id,quantity,price,total;
  ProductB(){}
  ProductB(String n,int p,int q, int u)
  {
    name=n;
    product_id=p;
    quantity=q;
    price=u;
  }
public int calculate()
{
  total=quantity*price;
  return total;
}
}

//main class
public class Bill{
  public static void main(String args[])
  {
    ProductB[][]order;
    System.out.println("Enter number of orders:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    order=new ProductB[n][];

    for(int i=0;i<n;i++)
    {
     System.out.println("Enter number of products:");
     int m=sc.nextInt();
     order[i]=new ProductB[m];
     for(int j=0;j<m;j++)
     {
       System.out.println("Enter product " + (j+1) +" name:");
       String a=sc.next();
       System.out.println("Enter product id:");
       int b=sc.nextInt();
       System.out.println("Enter  quantity of product:");
       int c=sc.nextInt();
       System.out.println("Enter price of product:");
       int d=sc.nextInt();
       
       ProductB pb=new ProductB(a,b,c,d);
       order[i][j]=pb;
       order[i][j].total=order[i][j].calculate();
      }

  }
     for(int i=0;i<n;i++)
     {
       int sum=0;
       System.out.println("Order No:"+(i+1));
       Date date=java.util.Calendar.getInstance().getTime(); //current time and date
       System.out.println(date);
       System.out.println("-----------------------------------------------------------------------------");
       System.out.printf("%5s %20s %25s %10s %10s","ProductId","Name","Quantity","Price","Total");
       System.out.println(); 
       System.out.println("-----------------------------------------------------------------------------");
       for(int j=0;j<order[i].length;j++)
       {
          System.out.printf("%5s %20s %25s %10s %10s",order[i][j].product_id,order[i][j].name,order[i][j].quantity,order[i][j].price,order[i][j].total);
          System.out.println(); 
        }
        System.out.println("-----------------------------------------------------------------------------");
        for(int k=0;k<order[i].length;k++)
         sum=sum+order[i][k].total;
         System.out.println("Net Amount:" +sum);
         System.out.println("-----------------------------------------------------------------------------");
 }
}
}

/*OUTPUT
------

Enter number of orders:
2
Enter number of products:
2
Enter product 1 name:
pencil
Enter product id:
101
Enter  quantity of product:
2
Enter price of product:
5
Enter product 2 name:
soap
Enter product id:
102
Enter  quantity of product:
2
Enter price of product:
30
Enter number of products:
2
Enter product 1 name:
pen
Enter product id:
111
Enter  quantity of product:
2
Enter price of product:
10
Enter product 2 name:
instrument_box
Enter product id:
222
Enter  quantity of product:
1
Enter price of product:
50
Order No:1
Fri Aug 06 02:22:34 IST 2021
-----------------------------------------------------------------------------
ProductId                 Name                  Quantity      Price      Total
-----------------------------------------------------------------------------
  101               pencil                         2          5         10
  102                 soap                         2         30         60
-----------------------------------------------------------------------------
Net Amount:70
-----------------------------------------------------------------------------
Order No:2
Fri Aug 06 02:22:34 IST 2021
-----------------------------------------------------------------------------
ProductId                 Name                  Quantity      Price      Total
-----------------------------------------------------------------------------
  111                  pen                         2         10         20
  222       instrument_box                         1         50         50
-----------------------------------------------------------------------------
Net Amount:70
-----------------------------------------------------------------------------*/
