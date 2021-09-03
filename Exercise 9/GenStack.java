/*3. Program to create a generic stack and do the Push and Pop operations.
*/

import java.util.*;

class Stack<T> {									//create a class Stack for push,pop element of a stack
	ArrayList<T> elements;
	Stack(int capacity )
	{
		elements = new ArrayList<T>(capacity);  
	}
	void push( T element)								//to push elements
	{
		elements.add(element);
	}
	T pop()	
	{
		return elements.remove(elements.size()-1);				//to pop last enterd item
	}
}

class GenStack{
	public static void main(String args[]){
		Integer c,ch,n,top=-1;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the capacity of the stack :");
		c =sc.nextInt();
		Stack<Integer> st = new Stack<Integer>(c);
		
		do{     System.out.println("----------------------");
			System.out.println("1.PUSH \n2.POP \n3.EXIT");
			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			switch(ch){
				case 1: if(top >= (c-1)){
						System.out.println("Stack is full");
					}
					else{
						System.out.print("Enter a value : ");
						n = sc.nextInt();
						st.push(n);
						top++;
					}
     					break;
				case 2: if(top <= -1){
						System.out.println("Stack is empty");			
					}
					else{
						 
						System.out.println("Removed element is "+st.pop());
						top--;
					}
					break;
			}
		}while(ch != 3);
	}
}
	
/*
Enter the capacity of the stack :
2
----------------------
1.PUSH
2.POP
3.EXIT
Enter your choice : 1
Enter a value : 10
----------------------
1.PUSH
2.POP
3.EXIT
Enter your choice : 1
Enter a value : 20
----------------------
1.PUSH
2.POP
3.EXIT
Enter your choice : 2
Removed element is 20
----------------------
1.PUSH
2.POP
3.EXIT
Enter your choice : 2
Removed element is 10
----------------------
1.PUSH
2.POP
3.EXIT
Enter your choice : 2
Stack is empty
----------------------
1.PUSH
2.POP
3.EXIT
Enter your choice :

*/


		