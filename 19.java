/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number to find Prime Factors ");   //
int number=sc.nextInt();
System.out.println("Given Number is : " + number);
System.out.print("Prime Factors are : " );
        for (int i = 2; i <= number; i++) {
 
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }
 
        if (number < 1) System.out.println(number);

	}
}
