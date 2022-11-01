/*
  Q2) WAP to sort ArrayList In Descending Order
  DAte:1/11
 */

package corejava;
import java.util.*;
public class Sort_ArrayList {

	public static void main(String[] args) 
	{
		ArrayList<String> col = new ArrayList<>();
		col.add("Vedanta");
		col.add("CHM");
		col.add("RKT");
		System.out.println("Array: " + col);
		
		//sorting ArrayList in Descending order using collections.sort() method
		
		Collections.sort(col,Collections.reverseOrder());
		System.out.println("Sorted ArrayList in Descending Order: " +col);

	}

}
