package basic_programming;
class FactorialRecusive 
{
	public static int fact(int a)
	{
		int fact=1;
		if (a==0)
		{
			return 1;
		}
		return fact=a*fact(--a);
	}
	public static void main(String[] args) 
	{
		int num=6;
		System.out.println("The Factorial of "+num+" is "+fact(num));
	}
}
