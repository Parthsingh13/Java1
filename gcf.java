//wap to find the greatest common factor between 2 numbers
import java.util.Scanner;
class Test{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any number:");
	int a=sc.nextInt();
    System.out.print("Enter any number:");
	int b=sc.nextInt();
	int GCD=0;
	for(int i=1; i<=a; i++)
	{
		if(a%i==0 && b%i==0)
		{
			GCD=i;
		}
	}
	System.out.println(GCD);
}

}

