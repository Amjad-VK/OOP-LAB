//Program to demonstrate the addition and deletion of elements in deque

import java.util.*;
class DequeD
{
 public static void main(String[] args) {

//Creating Deque and adding elements
 Deque<String> deque = new ArrayDeque<String>();
 deque.add("Apple");
 deque.addFirst("Mango");
 deque.addLast("Orange");

 Iterator<String> itr=deque.iterator();
 System.out.println("DEQUE ADDITION" );
 System.out.println("---------------");
    while(itr.hasNext())
    {
      System.out.println(itr.next());
     }

  System.out.println("\nDEQUE DELETION");
  System.out.println("----------------");
  System.out.println("Elements in deque:" +deque);
  System.out.print("Removing element at head:");
  deque.remove();
  System.out.println(deque); 
  System.out.print("Removing next element at head :");
  System.out.println(deque.poll());
  System.out.print("Removing last element :");
  System.out.println(deque.pollLast()); 
  System.out.println("Final deque:" +deque);
}
}

/*----------OUTPUT-----

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 8\5>java DequeD
DEQUE ADDITION
---------------
Mango
Apple
Orange

DEQUE DELETION
----------------
Elements in deque:[Mango, Apple, Orange]
Removing element at head:[Apple, Orange]
Removing next element at head :Apple
Removing last element :Orange
Final deque:[]

*/
Verified
