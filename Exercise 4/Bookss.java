

//Create class BOOK,PUBLISHER,FICTION,LITERATURE and Display Books Details
 



import java.util.Scanner ;

class Publishr{                                                                    // CLASS Publishr
	String publisher;
	Publishr(String s){
 		publisher=s;

	}
}
class Litertre extends Publishr{                                                      // CLASS Litertre
	String Literature;
	Litertre(String l,String p){
                super(p);
 		        Literature=l;
	}
}
class Fiction extends Litertre {                                                   // CLASS Fiction
	String fiction;
	Fiction(String f,String l,String p){
                super(l,p);
 		fiction=f;
	}
}
class Book extends Fiction {                                                     // CLASS Book
	String book;
	Book(String b,String f,String l,String p){
                super(f,l,p);
 		book=b;
               
	}
void DisplayBookinfo(Book bo[],int no){                                               // DISPLAY Method FOR DISPLAY ALL DATA
        System.out.print("\n--------------------------BOOK DETAILS-------------------------------");
        System.out.print("\n----------------------------------------------------------------- ");
        System.out.println("\n| Book \t\t| Fiction \t| Literature \t| Publisher \t|");
       
    for(int i=0;i<no;i++)
       {
        System.out.print("\n| "+bo[i].book+"\t| "+bo[i].fiction +"\t| "+ bo[i].Literature +"\t| "+bo[i].publisher+"\t|\n");
       
       }
}
}


class Bookss{
	public static void main(String[] args)
	{
	Scanner in = new Scanner (System.in ) ;
	System.out.print("\n> Enter number of Books : ") ; 
        int c = in.nextInt() ; 
        String book,lit,publi,fict;
        Book B[]=new Book[c];
        in.nextLine() ;
        for(int i=0;i<c;++i)
	{
		System.out.println("\n-----Enter  Details of  Book "+(i+1)+"-----") ;
		System.out.print(">Enter Book Name   : ") ;
		book = in.nextLine() ;
		System.out.print(">Enter Literature  : ") ;
		lit= in.nextLine() ;
		System.out.print(">Enter Fiction     : ") ;
		fict= in.nextLine() ;
		System.out.print(">Enter Publisher   : ") ;
		publi= in.nextLine() ;
		B[i] = new Book(book,fict,lit,publi);                                           // CREATING EACH OBJECT
	}
        System.out.println("\n------------------------------------------");
        char ch='y';
        while(ch!='n')
        {
 	       System.out.print("\n> Enter number of Books to be display : ") ; 
  	      int c2 = in.nextInt() ;
  	      if(c2>c)
  	           	System.out.println("\n----------------\n>Invaild Entry !  only "+c+" Books are available \n-----------------") ;
  	      else
			B[0].DisplayBookinfo(B,c2); 
            break;                                                 // CALLING METHOD TO DISPLAY ALL DATA
        
        } 
}
}


/*--------------------------------------------------
> Enter number of Books : 2

-----Enter  Details of  Book 1-----
>Enter Book Name   : Java
>Enter Literature  : Programming
>Enter Fiction     : IT
>Enter Publisher   : Sun

-----Enter  Details of  Book 2-----
>Enter Book Name   : GOT
>Enter Literature  : Thriller
>Enter Fiction     : Fantasy
>Enter Publisher   : Bob Odenkirk

------------------------------------------

> Enter number of Books to be display : 2

--------------------------BOOK DETAILS-------------------------------
-----------------------------------------------------------------
| Book          | Fiction       | Literature    | Publisher     |

| Java          | IT            | Programming   | Sun          |

| GOT           | Fantasy       | Thriller      |    Bob Odenkirk  |



-------------------------------------------------------------------*/


