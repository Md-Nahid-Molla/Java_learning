
package javaapplication;

import java.util.Scanner;

public class add_user {
    public static void main(String[] args) {
        
        int a,b,sum;
        
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a first num : ");
        a = num.nextInt();
        
        System.out.print("Enter a second num : ");
        b = num.nextInt();
        
        System.out.printf("Sum a + b = %d\n",a+b);
    }
    
}
