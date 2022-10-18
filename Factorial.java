//wap to find the factorial of number by taking user input
import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		int n;
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any number:");
		n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}