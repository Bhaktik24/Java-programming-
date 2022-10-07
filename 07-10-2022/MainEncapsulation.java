package corejava;

public class MainEncapsulation 
{
	public static void main(String[] args)
	{
	Encapsulation  e=new Encapsulation ();
   //calling setter method
	e.setRoll_no(18);
	e.setName("Bhakti");
	e.setLocation("Ambernath");
	
	
//calling getter method
	System.out.println("Roll no is:-" + e.getRoll_no());
	System.out.println("Name is:-" + e.getName());
	System.out.println("Location is:-" + e.getRoll_no());
	}
}
