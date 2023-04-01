/*Write a program to print Floyd’s triangle where n is command line input.
1
2 3
4 5 6
7 8 9 10
…..
N*/

class Solution_02
{
	static void printFloydTriangle(int n)
	{
		int i, j, val = 1;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= i; j++)
			{
				System.out.print(val + " ");
				val++;
			}
			System.out.println();
				
		}
	}
	public static void main(String[] args)
	{
		int i= Integer.parseInt(args[0]);
		printFloydTriangle(i);
	}
}