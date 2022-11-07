package Threading;

/*
 * If the class implements the Runnable interface
 * the thread can be run by passing an instance 
 * of the class to a Thread object's constructor
 * and then calling the thread's start() method.
  */

class Main_Runnable implements Runnable
{

	public static void main(String[] args) 
	{
		
		Main_Runnable m=new Main_Runnable();
		Thread t=new Thread(m);
		t.start();
		System.out.println("This code is outside the thread");
	}
	public void run()
	{
		System.out.println("This code is running in the thread");
	}


}
