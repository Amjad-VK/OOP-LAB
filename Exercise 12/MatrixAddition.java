//  Exercise 2 

//  2 : Perform Matrix addition
 
//---------------------------------------------

import java.util.Scanner;

public class MatrixAddition{  
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);    
	System.out.print("Rows    : ");
	int r=in.nextInt();                                // READING ROW COUNT
	System.out.print("Columns : ");
	int c=in.nextInt();                                // READING COLUM COUNT
	int[][] a=new int[r][c];
	int[][] b=new int[r][c];
	System.out.println("\n---1st matrix---:");                   
	for(int i=0;i<r;i++){                             // READING FIRST MATRIX
		for(int j=0;j<c;j++){    
			a[i][j]=in.nextInt();       
		}     
	}

	System.out.println("\n---2nd matrix---:");
	for(int i=0;i<r;i++){                             // READING FIRST MATRIX
		for(int j=0;j<c;j++){    
			b[i][j]=in.nextInt();       
		}     
	}
	System.out.println("\n----Addition Result-----\n");
   
	int ab[][]=new int[r][c];                        // CREATING NEW 2D ARRAY
    
	for(int i=0;i<r;i++){                            // PERFROMING ADDITION
		for(int j=0;j<c;j++){    
			ab[i][j]=a[i][j]+b[i][j];     
			System.out.print(ab[i][j]+"\t");    
		}    
		System.out.println();    
		}    
}}  


/*-----------------------------------------------------

                   OUTPUT
                   ------

Rows    : 2
Columns : 2

---1st matrix---:
1 2
2 2

---2nd matrix---:
3 3
1 3

----Addition Result-----

4       5
3       5
-----------------------------------------------------------*/
