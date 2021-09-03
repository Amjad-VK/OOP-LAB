//Program to demonstrate the working of Map interface by adding, changing and removing elements

import java.util.*;
class MapInterf 
{ 
  public static void main(String args[]) 
  { 
  // Creating a hash map


   Map<Integer,String> hm = new HashMap<Integer,String>();
 
  hm.put(1,"A"); 
  hm.put(2,"B"); 
  hm.put(3,"C"); 
  hm.put(4,"D");  
  System.out.println("ADDING ELEMENTS IN MAP");
  System.out.println("----------------------");
  System.out.println(" MAP:" +hm);
 
  
  // Create a hash map
  Map<Integer, String> hm1= new HashMap<Integer, String>();
  hm1.put(new Integer(100), "Hundred");
  hm1.put(new Integer(200), "TwoHundred");
  hm1.put(new Integer(300), "ThreeHundred");

  System.out.println("\nCHANGING ELEMENTS IN MAP");
  System.out.println("--------------------------");
  System.out.println("Map before changing: " +hm1);
  
  hm1.put(new Integer(2000), "Twothousand");
  
  System.out.println("Changed Map:" +hm1);

  //REMOVING ELEMENTS
  // Create a hash map
  Map<Integer, String> hm2= new HashMap<Integer, String>();
  // Inserting the Elements
  hm2.put(new Integer(1), "Java");
  hm2.put(new Integer(2), "Python");
  hm2.put(new Integer(3), "Rubi");
  hm2.put(new Integer(4), "C");
  System.out.println("\nREMOVING ELEMENTS IN MAP");
  System.out.println("--------------------------");
  // Initial Map
  System.out.println("Map before removing elements:" +hm2);
  hm2.remove(new Integer(4));
  // Final Map
  System.out.println("Map after removing elements:" +hm2);
}
}

/*--------------OUTPUT-----------------

ADDING ELEMENTS IN MAP
----------------------
 MAP:{1=A, 2=B, 3=C, 4=D}

CHANGING ELEMENTS IN MAP
--------------------------
Map before changing: {100=Hundred, 200=TwoHundred, 300=ThreeHundred}
Changed Map:{2000=Twothousand, 100=Hundred, 200=TwoHundred, 300=ThreeHundred}

REMOVING ELEMENTS IN MAP
--------------------------
Map before removing elements:{1=Java, 2=Python, 3=Rubi, 4=C}
Map after removing elements:{1=Java, 2=Python, 3=Rubi}
*/