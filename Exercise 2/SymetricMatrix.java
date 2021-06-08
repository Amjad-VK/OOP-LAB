// CHECK WHETHER A MATRIX IS SYMETRIC OR NOT
 

import java.util.Scanner;

public class SymetricMatrix{  
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);    
	System.out.print("Rows    : ");
	int r=in.nextInt();                                // READING ROW COUNT
	System.out.print("Columns : ");
	int c=in.nextInt();                                // READING COLUM COUNT
	int[][] a=new int[r][c];
	System.out.println("\n>Enter matrix :");                   
	for(int i=0;i<r;i++){                             // READING FIRST MATRIX
		for(int j=0;j<c;j++){    
			a[i][j]=in.nextInt();       
		}     
	}

	System.out.println("\n-------Result--------");
   
          //CHECKING MATRIX FOR SYMETRY
         
        if(r != c)
            System.out.println(">> Not a square matrix,so it is not symmetric.");
        else
        {  
            for (int i=0; i < r;i++)
            {
                for (int j=0;j<c;j++)
                {
                    if(a[i][j]!=a[j][i])                // CHECKING FOR EQUAL IN THE TWO OPPOSIT PLACE 
                    {
                        System.out.println("\n> Matrix is not symmetric...");
                        System.exit(0);
                    }
                }
            }

                System.out.println("\n>Matrix is symmetric...");
           
        }   
}}  


/*-----------OUTPUT-------------------------
Rows    : 2
Columns : 2

>Enter matrix :
1 2
2 1

-------Result--------

>Matrix is symmetric...


----------------------------------------
Rows    : 3
Columns : 3

>Enter matrix :
1 5 6
2 5 6
2 4 3

-------Result--------

> Matrix is not symmetric...


--------------------------------------------*/
