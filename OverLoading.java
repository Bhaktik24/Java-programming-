class Overloading 
{
static void display(int a)
{
System.out.println("pincode: " + a);
}

static void display(int a, int b)
{
System.out.println("pincode: " + a + " police station: " + b);
}

static void display(int a, int b,int c)
{
System.out.println("pincode: " + a + " police station: " + b + "  " + "assembly:" + "  " +c);
}

public static void main(String[] args) {
display(421501);
display(421501, 423650);
display(421501, 423650,559647);
}
}