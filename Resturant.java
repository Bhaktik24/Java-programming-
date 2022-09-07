import java.util.*;
class Resturant
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of starter:-");
	int a=sc.nextInt();

	System.out.println("Enter the value of main course:-");
	int b=sc.nextInt();

	System.out.println("Enter the value of desert:-");
	int c=sc.nextInt();

	int x=b*4/100;
	int y=c*4/100;
	int z=a+b+c+x+y;
	
	System.out.println("your bill:-" +z);
	}
}