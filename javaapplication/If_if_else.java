
package javaapplication;

import java.util.Scanner;

public class If_if_else {
    public static void main(String[] args) {
        
        int n;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = in.nextInt();
        
        if(n>0){
            System.out.println("Positive "+n);
        }
        else if(n<0){
            System.out.println("Negitave "+n);
        }
        else{
            System.out.println("Zero "+n);
        }
    }
    
}
