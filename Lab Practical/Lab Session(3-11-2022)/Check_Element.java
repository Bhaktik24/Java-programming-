/*
 Q2) Write a Java program to check if a particular element exists in a linked list.
 Name: Bhakti Khandekar
 Date: 3/11/2022
 */

package Labsession3_11;
import java.util.*;
class Check_Element {

	public static void main(String[] args) 
	{
		String s;
		try {
		LinkedList <String> col = new LinkedList <>();
	//using add() method
      col.add("Red");
      col.add("Green");
      col.add("Black");
      col.add("White");
      col.add("Pink");
      System.out.println("Original linked list: " + col);
      
      //get input from user which you have to check
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Value which you have to check: ");
      s=sc.next();
      
 // Checks whether the color "Green" exists or not.
if (col.contains(s)) {
   System.out.println( s + " is present in the linked list.");
} else {
   System.out.println( s + " is not present in the linked list.");
 }
		}
		// Catch block to handle the exceptions
	    catch (Exception e) {
	      System.out.println(e);
	    }

}

}


