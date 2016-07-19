package sample;

import java.util.Scanner;

public class Days {

	public static boolean main(String[] args)
	{
	String str;
	Scanner sc= new Scanner("System.in");
	System.out.println("enter string");
	str=sc.next();
	if(str.equals("monday") || str.equals("tuesday") || str.equals("wednesday") || str.equals("thursday") || str.equals("friday") || str.equals("saturday"))
		return true;
	else
		return false;
	}

}
