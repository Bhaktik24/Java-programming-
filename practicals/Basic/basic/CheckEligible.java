package corejava.basic;
import java.util.Scanner;
 class CheckEligible 
{

public static void main(String[] args) 
	{
		
 int age;
        // taking values from user at run time
Scanner sc = new Scanner(System.in);
System.out.println(" Please enter your age");
age = sc.nextInt();
// Checking condition for voting..
if(age>=18)
{
System.out.println("Welcome You can Vote");
}
else
{

System.out.println("Sorry,You cannot vote.....You can Vote After 18 years");
}

}
	}


