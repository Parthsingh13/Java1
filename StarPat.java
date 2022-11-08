//Wap in java to print te pattern

import java.util.*;
class Test {
    public static void main(String[] args) {
        System.out.printf("Enter the number of rows :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.printf("The pattern is as follows :\n");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.printf("*");
            }
            for(int j=i;j>=1;j--){
                System.out.printf("*",j);
            }
            System.out.printf("\n");
        }
    }
}