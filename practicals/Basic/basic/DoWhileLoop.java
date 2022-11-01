/*
 program to demonstarte do while loop and print the reverse counting 
 name: bhakti khandkar
 date: 12/10/22
 */



package corejava.basic;

import java.util.Scanner;

class DoWhileLoop {

	public static void main(String[] args)
	{
		int num,i,reversed = 0;
	    // taking values from user at run time
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the any Numbers: ");
	   num = sc.nextInt();
	   
	   sc.close();
	   //condition for printing reverse of given numbers
	   do
	   {
		    i=num%10;
		    reversed=reversed*10+i;
		    num=num/10;
		}
	   while(num>0);
		
		System.out.println("Reverse of the number is: "+reversed);
	   
	}

}
