/*
 Q3)Write a Java program to compare two sets and retain elements which are same on both sets. (use retainAll method)
 Name: Bhakti Khandekar
 Date: 3/11/2022
 */

package Labsession3_11;
import java.util.*;
class Retain_Element {

	public static void main(String[] args) 
	{
		try {
		HashSet<String> set1 = new HashSet<>();
	     // use add() method to add values in the hash set
	          set1.add("Red");
	          set1.add("Green");
	          set1.add("Black");
	          set1.add("White");
	          
	          System.out.println("Frist HashSet Elements: "+set1);
	          
	          HashSet<String>set2 = new HashSet<>();
	          set2.add("Green");
	          set2.add("Pink");
	          set2.add("Black");
	          set2.add("Orange");
	          System.out.println("Second HashSet Elements: "+set2);
	          
	          //using retainAll() method
	          set1.retainAll(set2);
	          
	          
	          System.out.println("Retain Elements: ");
	          System.out.println(set1);
		}
		// Catch block to handle the exceptions
	    catch (Exception e) {
	      System.out.println(e);
	     }

	}
}


