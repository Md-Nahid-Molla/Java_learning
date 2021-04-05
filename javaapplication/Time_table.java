
package javaapplication;

import java.util.Scanner;

public class Time_table {
    
    public static void main(String[] args) {
        
        int n,m=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for time table : ");
        n = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            m = n * i;
            
            
            System.out.printf("%d X %d = %d\n",n,i,m);
            
        }
    }
    
}
