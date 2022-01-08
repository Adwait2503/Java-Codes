package basic_programming;
class RecursiveFacto 
{
	public static int recur(int a)
	{
		int fact=1;
		if (a==0)
		{
			return 1;
		}
		return fact=a*recur(--a);
	}
	public static void main(String[] args) 
	{
		int num=5;
		System.out.println("The Factorial of "+num+" is -> "+recur(num));
	}
}
