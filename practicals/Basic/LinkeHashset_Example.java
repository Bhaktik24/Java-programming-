/*
  linked hashset is an ordered and sorted collection
  and it maintain the insertion order of the element
 */
package corejava;
import java.util.*;
 class LinkeHashset_Example {

	public static void main(String[] args) 
	{
		LinkedHashSet<String>obj1=new LinkedHashSet<>();
		 //using add() method
		 
		obj1.add("Bhakti");

		obj1.add("Pooja");

		obj1.add("Ashwini");
		
		System.out.println("LinkedHashSet is: "+obj1);
		
		//calling iterator() method
		Iterator<String>obj2=obj1.iterator();
		
		System.out.println("LinkedHashset using Iterator: ");
		while(obj2.hasNext())
		{
		    System.out.print(obj2.next());
		    
		    System.out.print(",");
		}
		
		
		


	}

}
