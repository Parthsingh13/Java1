/* A student will not be allowed to sit in exam if his/her attendance is less than 75 percent
   ~take following inputs from user 
1=> no of class held
2=> no of class attended
3=> and print percentage of class attended
4=> is student is allowed to sit in exam or not */

import java.util.*;
class Test
{
	public static void main(String[] agrs)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of class held:");
	double a=sc.nextInt();
	System.out.println("Enter the number of class attended:");
	double b=sc.nextInt();
	double c=((b/a)*100);
	System.out.println("Percentage of class attended:" +c);
	
	if(c>=75)
		System.out.println("U r Alligible");
	else
		System.out.println("U r not Alligible");
	}
}

