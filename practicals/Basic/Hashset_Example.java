/*
 * Hashset class implements the set interface, it uses hash table to Store the elements
 *  and contains only unique elements

 
 */



package corejava;

import java.util.*;

class Hashset_Example {

	public static void main(String[] args)
	{
	   HashSet<String> obj1=new HashSet<>();
		
		//using add() method
		
	obj1.add("Bhakti");
	obj1.add("Pooja");
	obj1.add("Sneha");
	
	System.out.println("Hashset is: " +obj1);
	
	//calling iterator() method
	Iterator<String> obj2= obj1.iterator();
	
	System.out.println("Hashset using Iterator: ");
	
	while(obj2.hasNext()) //hasNext is method to check next value in the value
	{
	System.out.print(obj2.next());
	
	 System.out.print(",");
	}
	
		
}

}
