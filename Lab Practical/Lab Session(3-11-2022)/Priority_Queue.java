/*
 Q5) Write a Java program to change priorityQueue to maximum priorityqueue.(you can use any loop)
 Name: Bhakti Khandekar
 Date: 3/11/2022
 */

package Labsession3_11;
import java.util.*;

class Priority_Queue {

	public static void main(String[] args) 
	{
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(10, Collections.reverseOrder());
	      
		   // Add numbers in the Queue
		   pq.add(10);
		   pq.add(22);
		   pq.add(36);
		   pq.add(25);
		   pq.add(16);
		   pq.add(70);
		   pq.add(82);
		   pq.add(89);
		   pq.add(14);
		   
		   //print given elements
		   System.out.println("Given Priority Queue: "+pq);

		System.out.print("Maximum Priority Queue: ");
		
		//initialize one integer for while loop
		Integer n;
		
		//use while loop for printing elements from maximum to minimum
		while( (n = pq.poll()) != null) 
		{
		  System.out.print(n+ " ");
		 }
		   
	}
	
}


