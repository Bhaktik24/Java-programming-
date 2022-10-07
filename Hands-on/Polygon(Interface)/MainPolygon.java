package corejava;
import java.util.*;
 class MainPolygon 
{
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter length:-");
		 int a=sc.nextInt();
		 System.out.println("Enter Breath:-");
		 int b=sc.nextInt();
		 
		 sc.close();
		 Reactangle r=new Reactangle();
		 r.getArea(a, b);
	 }
	 
	

}
