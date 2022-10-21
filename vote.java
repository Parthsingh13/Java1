import java.util.*;
class Test
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.print("What is your age:");
	int n=sc.nextInt();
	if(n>=18)
		System.out.println("You r able to vote");
	else
		System.out.println("You r not able to vote");
	}
}