/*
 program to demonstrate (Switch) and printing week days
 name: Bhakti Khandekar
 DAte:11/10/2022
 */



package corejava.basic;
import java.util.Scanner;
public class Weekday {

	

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
	    int day = 0;

	    System.out.println("Enter weekday number (1-7): ");
	    day = Sc.nextInt();

	    switch (day) 
	    {
	    case 1:
	        System.out.println("Sunday");
	        break;

	    case 2:
	        System.out.println("Monday");
	        break;

	    case 3:
	        System.out.println("Tuesday");
	        break;

	    case 4:
	        System.out.println("Wednesday");
	        break;

	    case 5:
	        System.out.println("Thursday");
	        break;

	    case 6:
	        System.out.println("Friday");
	        break;
	    case 7:
	        System.out.println("Saturday");
	        break;

	    default:
	      System.out.println("Invalid weekday number.");
	    }
	    
	  }
		
	}


