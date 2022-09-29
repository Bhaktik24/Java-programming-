import java.util.Scanner;
public class Palindrome {

	public static void main(String args[])
	   {
	      String a, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      a = sc.nextLine();
	 
	      int length = a.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + a.charAt(i);
	 
	      if (a.equals(rev))
	         System.out.println(a+" is a palindrome");
	      else
	         System.out.println(a+" is not a palindrome");
	 
	   }
}
