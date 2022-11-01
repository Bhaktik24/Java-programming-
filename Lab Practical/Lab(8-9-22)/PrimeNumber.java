import java.util.*;
class PrimeNumber
{
static boolean checkPrime(int i)
	{
	if(i<=1)
	{
	return false;
	}
	for(int j=2;j<=i/2;j++)
	{
	if(i%j==0)
	return false;
	}
	return true;
	}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to check a number is prime or not:- ");
int num =sc.nextInt();
if(checkPrime(num))
{
System.out.println(num +  " is prime number");
}
else
{
System.out.println(num +  " is not prime number");
}
	
}
}