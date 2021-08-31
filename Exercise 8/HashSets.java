//Write a Java program to compare two hash set

import java.util.*;

class HashSets
{
   public static void main(String args[])
   {
       System.out.println("COMPARING TWO HASHSET");
       System.out.println("----------------------");
     // Creating a hash set
       HashSet<String>set1 = new HashSet<String>();
     //add elements
	set1.add("Java");
	set1.add("Python");
	set1.add("Adbms");
	set1.add("Html");
	set1.add("PHP");

       //Traversing elements
         Iterator<String> itr1=set1.iterator();
        System.out.println("FIRST HASHSET: ");
         while(itr1.hasNext()){
           System.out.println(itr1.next());
         }
	

      // Creating another hash set

	HashSet<String>set2 = new HashSet<String>();
       
	set2.add("Java");
	set2.add("Python");
	set2.add("Adbms");
	set2.add("Html");
	set2.add("PHP");

         //Traversing elements
         Iterator<String> itr2=set2.iterator();
         System.out.println("SECOND HASHSET: ");
         while(itr2.hasNext()){
           System.out.println(itr2.next());

        }
	boolean res=set1.equals(set2);

	System.out.println("Are both sets are equal??: "+ res);
   }
}


/*-----------OUTPUT----------
E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 8\7>java HashSets
COMPARING TWO HASHSET
----------------------
FIRST HASHSET:
Java
Adbms
Html
PHP
Python
SECOND HASHSET:
Java
Adbms
Html
PHP
Python
Are both sets are equal??: true
*/