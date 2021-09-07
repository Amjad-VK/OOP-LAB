//Program to demonstrate the creation of Set object using the LinkedHashset class

import java.util.*;
class LinkedHashSets
{
  public static void main(String args[])
  {
   LinkedHashSet<String> set=new LinkedHashSet<String>();
   set.add("Cat");
   set.add("Cat");//no duplication occurs
   set.add("Set");
   set.add("Bat");

  Iterator<String> itr=set.iterator();
  System.out.println("LINKED HASHSET");
  System.out.println("--------------");

  while(itr.hasNext()){
  System.out.println(itr.next());
  }
 }
}

/*----OUTPUT-------

E:\ONLINE CLASS\S2\OOP\Exercises\Exercise 8\6>java LinkedHashSets
LINKED HASHSET
--------------
Cat
Set
Bat

*/
Verified
