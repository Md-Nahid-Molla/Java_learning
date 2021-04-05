
package javaapplication;

import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        
        int n;
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many number : ");
        n = input.nextInt();
        
        int a = 0,b  = 1;
        int fibo;
        System.out.print(a+" "+b);
        
        for (int i = 3; i <= n; i++) {
            fibo = a+b;
            System.out.print(" "+fibo);
            a = b;
            b = fibo;
            
        }
        System.out.println("");
       
    }
    
}
