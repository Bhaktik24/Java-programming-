/*
Ques2:WAP to demonstrate on nested For loop and print the output as shown in the above figure.
 name:- bhakti khandekar
 date:- 13/10/2022
 */

package lab2010;

class ForLoop {

	public static void main(String[] args) 
	{
		for (int r = 1; r <= 6; ++r)
		{
            for (int c = 1; c <= r; ++c) 
            {
                System.out.print("*");
            }
 
            System.out.println();
	}

}
}
