//Attendance calculation with having medical certicate
import java.util.*;
class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of classes attended:");
		double a=sc.nextDouble();
		System.out.println("Enter the total number of classes:");
		double b=sc.nextDouble();
		double p=((a/b)*100);
		
		if(p>=75){
			System.out.println("Allowed");
		}
		else{
			System.out.println("System has medical or not: 1 or 0");
			int r=sc.nextInt();
			if( r== 1){
				if(p>60){
					System.out.println(" yes Allowed ");
				}
				else{
					System.out.println("Not allowed ");
				}
			}
			else{
				System.out.println("Detain ");
			}
		}
	
		
	}
}
