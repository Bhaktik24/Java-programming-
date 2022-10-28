package corejava;
import java.util.Vector;
public class Vector_1 
{
	public static void main(String[] args) {

		Vector<String> obj1 = new Vector<>();
		//using the add() method
		obj1.add("Bhakti");
		obj1.add("Vikram");
		
		//using index number
		obj1.add(1, "Pooja");
		System.out.println("Vector: " + obj1);
		
		//using addAll() method
		Vector<String> obj2 = new Vector<>();
		obj2.add("Gaurav");
		obj2.add("Pranay");
		obj2.addAll(obj1);
		System.out.println("New Vector: "+obj2);
	}

}
