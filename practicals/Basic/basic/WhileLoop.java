/*
 program to demonstarte while loop contiues until entered number is positive
 name: bhakti khandekar
 date:12/10/22
 */



package corejava.basic;
import java.util.Scanner;
class WhileLoop 
{
	public static void main(String[] args)
	{
     int num;
    // taking values from user at run time
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number: ");
   num = sc.nextInt();
   //condition for checking the no. is positive or not
   while (num >= 0) 
   {
     System.out.println("This is Positive number....");
     num++;
     break;
   }

	}
}
