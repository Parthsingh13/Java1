/*
import java.util.Scanner;

class Test{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int ar[]=new int[n];
	for (int i=0; i<n; i++){
		ar[i]=sc.nextInt();
	}
	System.out.println("Odd nmbers are:");
	for (int i=0; i<n; i++){
		if (ar[i]%2!=0){
			
			System.out.println(ar[i]+" ");
		}
		
	}
	System.out.println();
	System.out.println("even number are");
	for (int i=0; i<n; i++){
		if (ar[i]%2==0){
			
			System.out.println(ar[i]+" ");
		}
}
}
}





import java.util.Scanner;

class Test{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int ar[]=new int[n];
	for (int i=0; i<n; i++){
		ar[i]=sc.nextInt();
	}
	for (int i=0; i<n; i++){
		int count=0;
		for(int j=2; j<ar[i]; j++){
			if(ar[i]%j==0){
				count++;
				break;
			}
		}
		if (count==0 && ar[i]!=1){
			System.out.println(ar[i]);
		}			
	}
	
}
}

*/


import java.util.Scanner;

class Test{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n =sc.nextInt();
	int ar[]=new int[n-1];
	for (int i=0; i<n-1; i++){
		ar[i]=sc.nextInt();
	}
	for (int i=1; i<=n; i++){
		int count=0;
		for(int j=0; j<n-1; j++){
			if (ar[j]==i){
				break;
			}
			else {
				count++;
			}
		}
		if (count==n-1){
			System.out.println(i);
			break;
		}
	}
}
}






