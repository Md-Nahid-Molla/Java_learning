
package javaapplication;

import java.util.Scanner;

public class Temperature_F_C {
    public static void main(String[] args) {
        
        double c,f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Fahrehet : ");
        f = in.nextDouble();
        
        c = 0.55 * f - 32;
        
        System.out.println("Celsius : "+c);
    }
}
