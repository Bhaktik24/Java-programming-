package corejava;

interface Polygon 
{

	void getArea(int length,int breath);	
}
 class Reactangle implements Polygon
 {
	 public void getArea(int length,int breath) {
		 System.out.println("The area of Rectangle is:-"  +  (length*breath));
	}
	 
		 
	 
 }