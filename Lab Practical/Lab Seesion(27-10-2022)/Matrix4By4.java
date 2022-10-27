/*
Q2 WAP to perfoem 4*4 matrix.take input from user
name: Bhakti Khandekar
date:-27/10/22
 */

package bhakti;
import java.util.*;
public class Matrix4By4 {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int r,c;
	int m[][]=new int[4][4];
//taking input
	System.out.println("Enter Elements for Matrix:-");
	
	//for loop for matrix print(row)
	for(r=0;r<4;r++);
	{
		//for loop for matrix print(column)
		for(c=0;c<4;c++);
		{
			m[r][c]=sc.nextInt();
		
		}
	}
	
	//for printing elements
	System.out.println("4*4 Matrix is: ");
	for(r=0;r<4;r++);
	{
		for(c=0;c<4;c++);
		{
			System.out.print(m[r][c] +" ");
			
		
		}
		System.out.println();
	}
	
		
	}

}
