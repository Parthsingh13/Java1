import java.util.Scanner;
class Test{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int a =sc.nextInt();
	int i;
	for(i=1; i<=10; i++)
		{System.out.println(a+"*"+i+"="+a*i);
		}
	}
}