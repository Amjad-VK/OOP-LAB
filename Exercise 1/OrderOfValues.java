/* Write a program that accepts three numbers from the user and prints if the numbers are in increasing order,"increasing order," if the
numbers are in decreasing order, and "Neither increasing or decreasing order"
otherwise*/
 


import java .util.Scanner ;
    class OrderOfValues{
  public static void main ( String args[ ] )
        {
                                                                
    Scanner in = new Scanner (System.in ) ;
        System.out.print("Enter first Number : ") ;
        int a = in.nextInt( ) ;                                
	System.out.print("Enter second Number : ") ;
        int b = in.nextInt( ) ;                                 
	System.out.print("Enter third Number : ") ; 
        int c = in.nextInt( ) ;                                 
        if(a<b && b<c)                                          
        	System.out.println(" >> Increasing ") ;
        else if(a>b && b>c)                                    
        	System.out.println(" >> Decreasing") ;
        else
        	System.out.println(" >> Neither increasing or decreasing order ") ;
}
}

/*----------------------------------
                   OUTPUT
                   ------
Enter first Number : 5
Enter second Number : 6
Enter third Number : 3
 >> Neither increasing or decreasing order

Enter first Number : 5
Enter second Number : 6
Enter third Number : 7
 >> Increasing

-------------------------------------------------*/