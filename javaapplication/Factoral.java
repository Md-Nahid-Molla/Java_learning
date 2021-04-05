
package javaapplication;

import java.util.Scanner;

public class Factoral {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n,sum = 1;
        System.out.print("Enter a number : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
            
        }
        System.out.printf("Factori of %d! = %d\n",n,sum);
        
    }
    
}
