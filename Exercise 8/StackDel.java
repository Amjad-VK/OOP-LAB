//Program to remove an object from the Stack when the position is passed as parameter



import java.util.*;
class StackDel
{
  public static void main(String args[])
  {
    //create a stack
    Stack<String> stack = new Stack<String>();
    //add
    stack.push("Violet");
    stack.push("Indigo");
    stack.push("Blue");
    stack.push("Green");
    stack.push("Yellow");

   System.out.println("Original Stack:");

   Iterator<String> itr=stack.iterator();
   while(itr.hasNext())
   {
       System.out.println(itr.next());
   }
    Scanner sn=new Scanner(System.in);
    System.out.print("Enter index position to be removed:");
    int st=sn.nextInt();

   stack.removeElementAt(st); 
   System.out.println("Final Stack: "+ stack);


  }
}

/*OUTPUT


E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 8\3>java StackDel
Original Stack:
Violet
Indigo
Blue
Green
Yellow
Enter index position to be removed:1
Final Stack: [Violet, Blue, Green, Yellow]

*/
Verified
