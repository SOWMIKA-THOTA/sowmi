import java.util.*;
import java.lang.*;
import java.io.*;
class program1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num;
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		num=Sc.nextInt();
		if(num>0)
		System.out.println("Given number is Poistive");
		else if(num<0)
		System.out.println("Given number is Negative");
		else 
		System.out.println("It is zero");
	}
}
