//wap program wheather a triangle is isoseles, scalateral and equilateral
//wap 2 find wheather it is a valid trianle or not

import java.util.Scanner;
class Test{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first angle of triangle:");
	int a=sc.nextInt();
	System.out.print("Enter the Secand angle of triangle:");
	int b=sc.nextInt();
	System.out.print("Enter the third angle of triangle:");
	int c=sc.nextInt();
	if(a+b+c==180){
		System.out.print("It is a triangle");
	}
	else{
		System.out.print("Not a triangle");
	}
}
}