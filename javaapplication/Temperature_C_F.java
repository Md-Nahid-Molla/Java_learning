
package javaapplication;

import java.util.Scanner;

public class Temperature_C_F {
    public static void main(String[] args) {
        
        double c,f;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter celsius : ");
        c = in.nextDouble();
        
        f = 1.8 * c + 32;
        
        System.out.println("Farenheit : "+f);
    }
}
