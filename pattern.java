package loops;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbr");
        int n = scan.nextInt();
        for (int i=0;i<n+1;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
        for (int k=0;k<n+1;k++){
            for (int l=n;l>k;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
