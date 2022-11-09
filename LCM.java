//wap in java to print the LCM of two numbers

import java.util.Scanner;
class Test{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the First number:");
	int a =sc.nextInt();
	System.out.print("Enter the Secand number:");
	int b =sc.nextInt();
	int max=Math.max(a,b);
	while(true){
		if(max%a==0 && max%b==0){
			System.out.println(max);
			break;
		}
		max++;
	}
}
}
