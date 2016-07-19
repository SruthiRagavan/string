package sample;
public class Reverse
{
public int reversenum(int num)
	{
int reverse=0;
while(num!=0)
{
reverse=(reverse*10)+(num%10);
num=num/10;
}
return reverse;
	}
public static void main1 (String args[])
 {
	Reverse obj = new Reverse();
	System.out.println("reverse is:" +obj.reversenum(12345));
 }
}