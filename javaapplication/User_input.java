
package javaapplication;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = input.nextInt();
        System.out.println("n = "+n);
        
        Scanner ch = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = ch.next();
        System.out.println("Name : "+name);
    }
    
}
