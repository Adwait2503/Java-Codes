package basic_programming;
class PrimeCount1 
{
	public static boolean count(int a)
	{
		for (int i=2;i<a ;i++ )
		{
			if (a%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int num1=100,num2=500,count=0;
		for (int i=num1;i<=num2 ;i++ )
		{
			if (count(i))
			{
				count++;
			}
		}
		System.out.println("The Count of Prime Numbers is :=> "+count);
	}
}
