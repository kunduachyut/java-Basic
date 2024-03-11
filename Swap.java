// Swap 2 numbers 

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        n2 = sc.nextInt();

        System.out.printf("The number should be : %d %d",n1,n2);
        System.out.println();
        
        n2 = n1+n2;
        n1 = n2-n1;
        n2 = n2 -n1;
        
    
        System.out.printf(" After Swap the number should be : %d %d",n1,n2);

        sc.close();

    }
}
