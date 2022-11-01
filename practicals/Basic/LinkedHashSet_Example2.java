/*
  Creating LinkedHAshset from ArrayList
 */
package corejava;
import java.util.*;
 class LinkedHashSet_Example2 {

	public static void main(String[] args) {
		 
		ArrayList<Integer>obj1=new ArrayList<>();
		//using add() method
		 obj1.add(2);
		 obj1.add(5);
		 obj1.add(10);
		 
		 System.out.println("Array List is: "+obj1);
		 
		 //Creating list HashSet from an ArrayList
		 
		 LinkedHashSet<Integer> obj2=new LinkedHashSet<>(obj1);
		 
		 System.out.println("LinkedHashSet is: " +obj2);
		 
		

	}

}
