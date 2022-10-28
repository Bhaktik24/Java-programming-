package corejava;
import java.util.*;
public class Priority_Queue 
{
public static void main(String[] args) {
		
		//using linkedList class to create queue.
		Queue<Integer> obj1 = new PriorityQueue<>();
		//offer elements to the queue
		obj1.offer(20);
		obj1.offer(340);
		obj1.offer(674);
		System.out.println("Queue is: "+obj1);
		
		//access element of the queue using peek() method
		int i = obj1.peek();
		System.out.println("access element: " + i);
		
		//remove element from the queue using poll() method
		int j = obj1.poll();
		System.out.println("removed element: " + j);
		
		System.out.println("the updated is queue: "+obj1);
	}

	
}
