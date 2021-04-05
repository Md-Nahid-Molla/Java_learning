
package javaapplication;

import java.util.Scanner;

public class Sum_num {
    
    public static void main(String[] args) {
        
        int j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a last number : ");
        j = input.nextInt();
        
        int sum = 0;
        
        for (int i = 1; i <= j; i++) {
            
            sum = sum+i;
            
        }
        System.out.printf("sum of number 1 to %d = %d\n",j,sum);
    }
    
}
