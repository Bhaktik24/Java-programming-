/*
 Ques3:WAP to print sum of 10 natural numbers using while loop.
 name:- bhakti khandekar
 date:- 13/10/2022
 */

package lab2010;

public class Sum {

	public static void main(String[] args) 
	{
		int num = 10;
		
		
		int sum=0,i=1;
		
		while(i<=num)
			{
			sum=sum+i;
			i++;
			
			}
		System.out.println("sum of 1-10 natural numbers:-" +sum);



	}

}
