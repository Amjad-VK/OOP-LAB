import java.util.Scanner ;

public class StringManipulation{
    public static void main(String[] args) {
        //Scanner in = new Scanner (System.in ) ;

        System.out.println("\n-------Creation of strings--------");
        String s1="BOARD";//creating string by 'string' 
        char ch[]={'B','O','A','T'};  
        String s2=new String(ch);          //converting char array to string  
        String s3=new String("How are You ");      //creating java string usind new keyword  
        System.out.println(s1);  
        System.out.println(s2);  
        System.out.println(s3);  

        byte ascii[]={65,66,67};
        String str2=new String(ascii);
        System.out.println("Created from byte[]:"+str2);  //byte to string




        System.out.println("\n-------String Length--------");
        System.out.println("Length of "+ s3 +" is :"+ s3.length());



        System.out.println("\n-----String Concatenation-------");
        Scanner in = new Scanner (System.in ) ;
        String s4 = new String();
        System.out.print("\n> Enter a string : ") ;                   
           s4=in.nextLine();
           System.out.println("\n>Concatinated Using concat(string)="+s3.concat( s4));
           System.out.println("\n>Concatinated string using '+'="+s3 +s4);

        

            System.out.println("\n-----Character Extraction----------");
            String s="We are Playing now,i am ready";
        System.out.println("Character at 4th postion in "+s+" is "+s.charAt(4));
		char c[]=new char[6];
		s.getChars(13,18,c,0);
		System.out.println("Character between 13 to 18 in "+s+" is "+new String(c));
        
        

        System.out.println("-----------STRING COMPARE-------------") ; 
        String sc = "Hello";
		String sc2 = "HELLO";
		System.out.println(s1 + " equals " + s2 + " -> " + sc.equals(sc2));
		System.out.println(s1 + " compareTo() " + s2 + " -> " + sc.compareTo(sc2));  
		System.out.println(s+" starts with Know -> "+s.startsWith("How"));
		System.out.println(s+" ends with Know -> "+s.endsWith("You"));




           
	     System.out.println("------------ SUBSTRING SEARCH-------") ; 
         String sb="what is you name";
         //String sb = new String();
           System.out.print("\n> Enter substring to search : ") ;                   
           s2=in.nextLine();
           if(sb.indexOf(s2)==-1)                       
                 System.out.println("\n>>>>> : substring not found ") ;
           else
                 System.out.println("\n>>>>> : substring found at "+(sb.indexOf(s2)+1)) ;


         System.out.println("---------STRING MODIFY---------") ;
        String sm="I am ready";
        
        System.out.println("substring of "+s+" is "+sm.substring(3));
		System.out.println("Result of replaced string : "+sm.replace("ready","not ready"));
                         
                         
          
                         
    System.out.println("-------------VALUEOF()-------------") ;
    int v=3;
    System.out.println(v+" is converted into "+String.valueOf(v)); 
    }
}

/*
-------Creation of strings--------
BOARD
BOAT
How are You
Created from byte[]:ABC

-------String Length--------
Length of How are You  is :12


-----String Concatenation-------

> Enter a string : ?
>Concatinated Using concat(string)=How are You ?
>Concatinated string using '+'=How are You ?


-----Character Extraction----------
Character at 4th postion in We are Playing now,i am ready is r
Character between 13 to 18 in We are Playing now,i am ready is g now


-----------STRING COMPARE-------------
BOARD equals BOAT -> false
BOARD compareTo() BOAT -> 32
We are Playing now,i am ready starts with Know -> false
We are Playing now,i am ready ends with Know -> false



------------ SUBSTRING SEARCH-------

> Enter substring to search : is

>>>>> : substring found at 6


---------STRING MODIFY---------
substring of We are Playing now,i am ready is m ready
Result of replaced string : I am not ready
-------------VALUEOF()-------------
3 is converted into 3

------------------------------------------------------*/