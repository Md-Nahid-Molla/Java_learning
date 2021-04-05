
package javaapplication;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        
         int b,h;
         double area;
         
         Scanner num = new Scanner(System.in);
         System.out.print("Enter base : ");
         b = num.nextInt();
         System.out.print("Enter hight : ");
         h = num.nextInt();
         
         area = 0.5*b*h;
         System.out.println("area = "+area);
         
    }
    
}
