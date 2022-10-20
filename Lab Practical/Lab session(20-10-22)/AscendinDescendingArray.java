/*
  Q1)Ascending and Descending Array 
  Name:- Bhakti Khandekar
  date:- 20/10/2022
 */



package lab20;
import java.util.*;
public class AscendinDescendingArray {

	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements in Array");
		int a=sc.nextInt();
		Integer array[]=new Integer[a];
		
		
		System.out.println("Enter Elements:");
		
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
		
		//print original array
		System.out.println("Original Array:- "+Arrays.toString(array));
		
		//sort the array in ascending order 
	    Arrays.sort(array);
		System.out.println("Array in Ascending oder:-" +Arrays.toString(array));
			
		//sort the array in descending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.print("Arrays in Descending order:-" +Arrays.toString(array));
		
	}

}

