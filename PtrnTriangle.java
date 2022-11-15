import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("The pattern is as follows :\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
				if(j<(n-1)-i){
				
				System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			}						
		System.out.println();
		
		}			
           	
		
	}
}	