package aggregation;

public class Person {

	String name;
	Addresss a1;
	int contact;
	
	
	//public Person(String name,Address address,int pincode,int contact) {
		
		//super();
		//this.name=name;
		//this.addresss=address;
		//this.contact=contact;
	//}
	
	public Person(String name, Addresss a1, int contact) {
		super();
		this.name=name;
		this.a1=a1;
		this.contact=contact;
	}

	void show()
	{
		System.out.println(name);
		System.out.println(a1);
		
		System.out.println(contact);
	}

}
