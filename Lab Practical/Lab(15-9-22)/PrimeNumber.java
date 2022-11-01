import java.util.Scanner;
class PrimeNumber
{
	static boolean checkPrime(int num)
	{
	for(int i=2;i<=num/i;++i)
	{
		if(num%i==0)
		{
		return false;
		}
	}
	return true;
	}
public static void main(String[] args)
{

Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the start of range: ");
int start = scan.nextInt();
System.out.print("Enter the end of range: ");
int end = scan.nextInt();
System.out.println("Prime numbers of given range:");
System.out.println();
for(int n=start;n<=end ;n++) 
{
 if(checkPrime(n))
{
 System.out.println(n);
}
}
}
}
