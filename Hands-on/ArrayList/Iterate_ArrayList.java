/*
 Q1) WAP to Iterate ArrayList
 date:1/11
 */



package corejava;
import java.util.*;
 class Iterate_ArrayList 
{
public static void main(String ... args ) {
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Bugatti");
		cars.add("Ferrari");
		cars.add("Mercedes");
		cars.add("Morris Garage");
		
		System.out.println("Array List: " + cars);
		//calling iterator() method
		Iterator<String> obj2= cars.iterator();
		
		System.out.println("Hashset using Iterator: ");
		
		while(obj2.hasNext()) //hasNext is method to check next value in the value
		{
		System.out.print(obj2.next());
		
		System.out.print(",");
		}
	}

}
