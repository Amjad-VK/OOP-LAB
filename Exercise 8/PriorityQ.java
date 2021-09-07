//Program to demonstrate the creation of queue object using the PriorityQueue class


import java.util.*;
class PriorityQ
{
  public static void main(String args[])
  {
    //create PriorityQueue
    PriorityQueue<String> queue=new PriorityQueue<String>();

    //add elements
    queue.add("Apple");
    queue.add("Zerbra");
    queue.add("Corn");
    queue.add("Sea");

    System.out.println("head:"+queue.element()); //it is used to retrieves, but does not remove, the head of this queue.
    System.out.println("head:"+queue.peek()); //it is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty

    System.out.println("Iterating the queue elements:");
    Iterator<String> itr=queue.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
     }
   queue.remove(); //It is used to retrieves and removes the head of this queue
   queue.poll(); //It is used to retrieves and removes the head of this queue, or returns null if this queue is empty
   System.out.println("After removing two elements:");

   Iterator<String> itr2=queue.iterator();
   while(itr2.hasNext()){
   System.out.println(itr2.next());
   }
}
}

/*---------OUTPUT---------------


E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 8\4>java PriorityQ
head:Apple
head:Apple
Iterating the queue elements:
Apple
Sea
Corn
Zerbra
After removing two elements:
Sea
Zerbra


*/
 
Verified
