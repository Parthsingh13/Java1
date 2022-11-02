//wap program wheather a triangle is isoseles, scalene and import java.util.Scanner;
import java.util.Scanner;
class Test{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of first side of triangle:");
	int a=sc.nextInt();
	System.out.print("Enter the length of Secand side of triangle:");
	int b=sc.nextInt();
	System.out.print("Enter the length of third side of triangle:");
	int c=sc.nextInt();
	if(a==b && b==c){
		System.out.print("Equilateral triangle");
	}
	else if(a==b || b==c || c==a){
		System.out.print("Isosceles triangle");
	}
	else{
		System.out.print("Scalene triangle");
	}
}
}