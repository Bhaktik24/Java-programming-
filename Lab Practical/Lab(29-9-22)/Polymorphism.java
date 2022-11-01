class Unviversity
{  
void course()
{
System.out.println("drawing...");
}  
}  
class Bscit extends Unviversity
{  
void course()
{
System.out.println("IT IS BSCIT...");
}  
}  
class Bcom extends Unviversity
{  
void course()
{
System.out.println("IT IS BCOM...");
}  
}  
class Bms extends Unviversity
{  
void course()
{
System.out.println("IT IS BMS...");
}  
}  

	class Polymorphism
	{  
		public static void main(String args[])
		{  
		Unviversity u;  
		u=new Bscit();  
		u.course();  
		u=new Bcom ();  
	u.course();  
	u=new Bms();  
	u.course();  
	}  
	}  