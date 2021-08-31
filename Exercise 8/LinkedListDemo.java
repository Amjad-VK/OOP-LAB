//Program to remove all the elements from a linked list




import java.util.*;
class LinkedListDemo
{
  public static void main(String[] args) 
  {
    //create a linked list
     LinkedList<String> list = new LinkedList<String>();
     //add elements in the linked list
          list.add("2");
          list.add("3");
          list.add("4");
          list.addLast("5");
          list.addFirst("1");
      
   System.out.println("Original contents of linked list: " +list);

  //remove all elements from the linked list using clear()
     list.clear();
 
    System.out.println("After removing elements in linked list are: " +list);
  }
}

/*OUTPUT


E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 8\2>JAVA LinkedListDemo
Original contents of linked list: [1, 2, 3, 4, 5]
After removing elements in linked list are: []



*/