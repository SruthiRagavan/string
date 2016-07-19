package sample;
import java.util.Scanner;
public class Num
{
public static void main(String[] args)
	{
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	a=sc.nextInt();
	if(a<0)
		System.out.println("number is negative");
	else if(a>0)
		System.out.println("number is positive");
	else if(a==0)
		System.out.println("'number is zero");
	}

}
