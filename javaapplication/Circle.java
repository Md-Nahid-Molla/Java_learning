
package javaapplication;

import java.util.Scanner;

public class Circle {
    
    public static void main(String[] args) {
        
        double r,area;
        
        Scanner num = new Scanner(System.in);
        System.out.print("Enter r : ");
        r = num.nextInt();
        
         area = 3.1416 * r*r;
         
         System.out.println("Area of Circle = "+area);
    }
}
