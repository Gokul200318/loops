package loops;
import java.util.Scanner;
public class tables  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        int length = scan.nextInt();
        int result=0;
        int i=0;
        for(i=1;i<length+1;i++){
            result = n*i;
            System.out.println(n + "*" + i + "=" + result);
        }
        
    }

}

