package corejava;
import java.util.*;
public class ArrayDeque_1 
{
	public static void main(String[] args) {

		ArrayDeque<String> obj1 = new ArrayDeque<>();
		
		obj1.add("Sanjay");
		obj1.add("neha");
		
		//using addFirst() method
		obj1.addFirst("Pooja");
		
		//using addLast() method
		obj1.addLast("Bhakti");
		
		System.out.println("Array Deque: " + obj1);
	}


}
