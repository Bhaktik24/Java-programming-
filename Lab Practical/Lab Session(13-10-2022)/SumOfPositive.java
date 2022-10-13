/*
Ques4:WAP to print sum of only positive numbers using do-while loop. Take the input from the user. 
if the user enters any negative number then that number should not be added in sum.
name:- bhakti khandekar
 date:- 13/10/2022
 */

package lab2010;
import java.util.Scanner;
 class SumOfPositive 
{

	public static void main(String[] args) {
		{
        Scanner sc = new Scanner(System.in);
        int sum = 0;
		 int num = 0; 
		    
		    do
		    {
		      
		      sum += num;
		      System.out.print("Enter a number");
		      num = sc.nextInt();
		    }
		    while(num >= 0); 
			   
		    System.out.println("Sum = " + sum);
		    sc.close();
		   
		  }
	}
		
	}



