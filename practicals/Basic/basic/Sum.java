package corejava.basic;
import java.util.Scanner;

 class Sum {
	 public static void main(String[] args) {
	      
		    
		 {
		  
		   
		 
         Scanner input = new Scanner(System.in);
         int sum = 0;
		 int number = 0; 
		    
		    do
		    {
		      
		      sum += number;
		      System.out.print("Enter a number");
		      number = input.nextInt();
		    }
		    while(number >= 0); 
			   
		    System.out.println("Sum = " + sum);
		    input.close();
		   
		  
	 }
	 

}
 }
