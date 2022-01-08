package basic_programming;
class Palindrome1 
{
	public static boolean palin(int a)
	{
		int temp=a,rev=0;
		while (temp!=0)
		{
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		if (a==rev)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int num1=100,num2=500,count=0;
		for (int i=num1;i<=num2 ;i++ )
		{
			if (palin(i))
			{
			System.out.println(i);
			count++;
			}
		}
		System.out.println("The Count of Palindrome Numbers is "+count);
	}
}
