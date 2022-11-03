/*
 Q4) Write a Java program to get the element in a tree set which is strictly greater than 
 or equal to the given element.
 Name: Bhakti Khandekar
 Date: 3/11/2022
 */

package Labsession3_11;
import java.util.*;
 class Tree_Set {

	public static void main(String[] args) 
	{
		TreeSet <Integer>num = new TreeSet<Integer>();
		   
		   // using add() method
		   num.add(10);
		   num.add(22);
		   num.add(36);
		   num.add(25);
		   num.add(16);
		   num.add(70);
		   num.add(82);
		   num.add(89);
		   num.add(14);
		   
		   //using higher() method for checking higher value
		   System.out.println("Strictly greater than 80 : "+num.higher(76));
		   
		   //using ceiling() method for checking grater than or equal to value
		   System.out.println("Greater than or equal to 22 : "+ num.ceiling(22));
		   }    

	}


