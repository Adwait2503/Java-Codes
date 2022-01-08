package basic_programming;
class StrongNumberCount1 
{
	public static int fact(int b)
	{
		int fact=1;
		for (int i=2;i<=b ;i++ )
		{
			fact=fact*i;
		}
		return fact;
	}
	public static boolean strong(int a)
	{
		int sum=0,temp=a;  
		while (temp!=0)
		{
		int d=temp%10;
		sum=sum+fact(d);
		temp=temp/10;
		}
		if (sum==a)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int num1=10,num2=500,count=0;
		for (int i=num1;i<=num2 ;i++ )
		{
			if (strong(i))
			{
				System.out.println("The Number "+i+" is Strong...");
				count++;
			}
		}
		System.out.println("The Number of Strong Numbers between "+num1+" and "+num2+" are -> "+count);
	}
}
