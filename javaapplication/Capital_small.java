
package javaapplication;

import java.util.Scanner;

public class Capital_small {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char  ch;
        System.out.print("Enter a char : ");
        ch = input.next().charAt(0);
        
        if(ch>='a' && ch <='z'){
            System.out.println("Small letter : "+ch);
        }
        else if(ch>='A' && ch <='Z'){
            System.out.println("Capital letter : "+ch);
        }
        else{
            System.out.println("Not a letter : "+ch);
        }
    }
 
}
