package Exception_Handling;
import java.io.*;
class ArithmeticException_Divideby0 
{
	
	public static void main(String[] args) 
	{
		try 
		{
            int n = 30 / 0; 
            // Trying to divide by zero
        } 
		catch (ArithmeticException e) 
		{
            System.err.println("ArithmeticException => " +e.getMessage());
         

	    }
	}
}

