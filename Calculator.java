//Wap to make a calculator and opertions are add ,sub ,mul, div
import java.util.Scanner;
class Test{
public static void main(String[] args)
{
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any number:");
	int a=sc.nextInt();

	System.out.print("Enter any number:");
	int b=sc.nextInt();
	
	System.out.println("What do u want to do with these numbers");
	str=sc.next();
	if(str.equals("+")){
		System.out.print(a+b);
	}
	if(str.equals("-")){
		System.out.print(a-b);
	}
	if(str.equals("*")){
		System.out.print(a*b);
	}
	if(str.equals("/")){
		System.out.print(a/b);
	}
}
}
