
package javaapplication;

import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit = ");
        n = input.nextInt();
        
        switch(n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not digit");
            
        }
    }
    
}
