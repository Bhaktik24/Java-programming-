package Exception_Handling;
import java.io.*;
 class Throws_Example {
	//defining a method  
	 public static int divideNum(int m, int n) throws ArithmeticException 
	 {  
	     int div = m / n;  
	     return div;  
	 }  


	public static void main(String[] args)
	{
		Throws_Example obj = new Throws_Example();  
	     try 
	     {  
	         System.out.println(obj.divideNum(45, 0));  
	     }  
	     catch (ArithmeticException e)
	     {  
	         System.out.println("\nNumber cannot be divided by 0");  
	     }  
	       
	     System.out.println("Rest of the code..");  
	}

}
