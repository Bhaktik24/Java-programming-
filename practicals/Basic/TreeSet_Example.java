/*
 Tree set class implements set interface that uses a tree for storage
 */

package corejava;
import java.util.*;
class TreeSet_Example {

	public static void main(String[] args)
	{
        SortedSet<String> fruits = new TreeSet<>();
		
		fruits.add("Mango");
		fruits.add("papaya");
		fruits.add("Apple");
		fruits.add("Pineapple");
		
		System.out.println("Fruits are : " +fruits);
		
		//duplicate elements are ignored
		fruits.add("pineapple");
		System.out.println();
		System.out.println("After adding duplicate elements : " +fruits);

	}
	
	}


