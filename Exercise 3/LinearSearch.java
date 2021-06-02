import java.util.Scanner;

class LinearSearch{

public static void main(String args[]){

Scanner in =new Scanner(System.in);

System.out.print("Enter No Of Elements: ");
int size=in.nextInt();                          //reading (size of array)

int Array[]= new int[size]; 

int i,j;

    for (i=0;i<size;i++) // reading elements
    {
        System.out.print("Enter Element "+(i+1)+" : " );
        Array[i]=in.nextInt();

    }
  
  System.out.println("ENTERD ELEMENTS ARE" );// displaying entred elements

     for (i=0;i<size;i++)
     {
        
        System.out.println(Array[i]);
     }

  int flag=0;
 
  System.out.print("Enter the Element to be Searched: " ); // reading element to be searched
  int SEARCH=in.nextInt();

  for(i=0;i<size;i++){
   
      if (Array[i]==SEARCH) // checking
      {
       System.out.println("Number "+SEARCH+" Found At Position"+(i+1));
        
      }
      else
      {
        flag=1;// flag is set to false every time if there no match found
        continue;
      } 

   }
  
 if(flag==1)// checking flag status
 System.out.println(SEARCH+" NOT FOUND ");

  
}

}


/*------------Output------------------------

Enter No Of Elements: 5
Enter Element 1 : 3
Enter Element 2 : 5
Enter Element 3 : 4
Enter Element 4 : 8
Enter Element 5 : 6
ENTERD ELEMENTS ARE
3
5
4
8
6
Enter the Element to be Searched: 4
Number 4 Found At Position3
4 NOT FOUND

-------------------------------------------------*/



