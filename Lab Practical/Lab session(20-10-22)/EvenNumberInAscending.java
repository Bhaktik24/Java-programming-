/*
 Q2)WAP to enter even number in array and print in ascending order
 Name:- Bhakti Khandekar
  date:- 20/10/2022
 */

package lab20;
import java.util.*;
public class EvenNumberInAscending {

	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int a=sc.nextInt();
		int array[]=new int[a];

		System.out.println("Enter elements:");
		
		//using for loop
		for(int i=0;i<a;i++)
		{
			array[i]=sc.nextInt();
		}
		//sorting even number in ascending order
		Arrays.sort(array);
		
		//print even numbers in ascending order
		System.out.print("Ascending Even numbers of Array:[");
		
		//using for loop
		for(int j=0;j<a;j++)
		{
			//condition for even number
			if(array[j] % 2==0 )
			{
				
				System.out.print(array[j]+" ");
				
			}
			
			//out.println();
		}
		System.out.print("]");
		
	}

}
