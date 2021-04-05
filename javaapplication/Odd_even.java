
package javaapplication;

import java.util.Scanner;

public class Odd_even {
    
    public static void main(String[] args) {
        
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = input.nextInt();
        
        if(n%2==0){
            System.out.println("Even = "+n);
        }
        else{
            System.out.println("Odd = "+n);
        }
    }
}
