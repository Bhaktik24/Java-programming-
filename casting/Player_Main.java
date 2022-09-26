package casting;

public class Player_Main {

	public static void main(String[] args)
	{
		Player p1=new Cricketer();
		
		p1.stadium();
		p1.fees();
		
		if(p1 instanceof Cricketer)
		{
			((Cricketer)p1).ball();
		}
		
		if(p1 instanceof Cricketer)
		{
			((Cricketer)p1).bat();
		}
		

	p1=new Footballer();
		
		p1.stadium();
		p1.fees();
		
		
		
		if(p1 instanceof Footballer)
		{
			((Footballer) p1).defence();
			
	
		}
		if(p1 instanceof Footballer)
		{
			((Footballer) p1).goal();
			
	
		}
}
}
