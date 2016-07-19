package sample;
import java.util.Scanner;
public class Conversion
{
private static Scanner sc;
public static void main(String[] args)
	{
		String st;
		System.out.println("enter string");
		sc = new Scanner(System.in);
		st=sc.next();
		int num=Integer.parseInt(st);
		System.out.println("num as integer" +num);
				
	}

}
