
package javaapplication;

import java.util.Scanner;

public class Conditional_operator {
    
    public static void main(String[] args) {
        
        int x,y,large;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 2 numbers : ");
        x = input.nextInt();
        y = input.nextInt();
        
        large = (x>y) ? x : y;  // ? mean if and : mean else
        System.out.println("Large number = "+large);
    }
}
