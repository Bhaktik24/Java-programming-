package corejava.basic;
import java.util.Scanner;
public class Narrowing1 {

	public static void main(String[] args) {
		
	        //take input from user
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			double d=sc.nextInt();
			sc.close();
			//explicit type casting required
			long l=(long)d;
			//explicit type casting required
			int i=(int)l;   
			
			System.out.println("double value is:"+d);
			System.out.println("long value is:"+l);
			System.out.println("int value is:"+i);
	}

}
