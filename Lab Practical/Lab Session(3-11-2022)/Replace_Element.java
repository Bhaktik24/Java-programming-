/*
 Q1) Write a Java program to replace the second element of a ArrayList with the specified element.
 Name: Bhakti Khandekar
 Date: 3/11/2022
 */

package Labsession3_11;
import java.util.*;
 class Replace_Element {

	public static void main(String[] args) {
		// Try block to check for exceptions
	    try {
	 
	      // Creating an object of ArrayList class
	      ArrayList<String> animal = new ArrayList<>();
	 
	 
	  
	      // using add() method
	      animal.add("Dog");
	      animal.add("cat");
	      animal.add("tiger");
	      
	 
	      // Print all the elements
	      System.out.println("Given ArrayList:"+animal);
	 
	 
	      //Replace Index 2 "tiger" with "lion"
	     
	      animal.set(2, "lion");
	 
	    
	      System.out.println("ArrayList After Replacement : " +animal);
	 
	    }
	 
	    // Catch block to handle the exceptions
	    catch (Exception e) {
	      System.out.println(e);
	    }
	  }

	}


