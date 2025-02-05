package loops;

import java.util.Scanner;

public class number_prbl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
