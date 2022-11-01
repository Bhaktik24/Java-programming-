class Overloading 
{
void display(int a)
{
System.out.println("pincode: " + a);
}
void display(int a, int b)
{
System.out.println("pincode: " + a + " police station: " + b);
}
void display(int a, int b,int c)
{
System.out.println("pincode: " + a + " police station: " + b + "  " + "assembly:" + "  " +c);
}

public static void main(String[] args) {
Overloading ov=new Overloading();
System.out.println(ov.display(421501));
System.out.println(ov.display(421501, 423650));
System.out.println(ov.display(421501, 423650,559647));
}
}