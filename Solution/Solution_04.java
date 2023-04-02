/*Write a program that will accept two strings or two numbers from command line and create 
  overloaded method that add these two numbers or concate two strings.*/
import java.io.*;
class Solution_04
{
	static boolean isNumber(String s)
	{
		for(int i=0;i<s.length();i++)
			if(Character.isDigit(s.charAt(i))==false)
				return false;
		return true;
	}
	void add(int a, int b)
	{
		System.out.println("Result is : "+(a+b)) ;
	}
	void add(String a, String b)
	{
		System.out.println("Result is : "+(a+b));
	}
	public static void main(String[] args)
	{
		Solution_04 obj = new Solution_04();
		if(isNumber(args[0])&&isNumber(args[1]))
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			obj.add(a,b);   
		}
		else
			obj.add(args[0],args[1]);
	}
}