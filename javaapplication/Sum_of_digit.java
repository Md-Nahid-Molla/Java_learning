
package javaapplication;

import java.util.Scanner;


public class Sum_of_digit {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a intger number : ");
        int n = input.nextInt();
        
        int temp = n,sum = 0;
        
        while(temp != 0){
            int r = temp%10;
            sum = sum +r;
            temp = temp /10;
           
            
        }
         System.out.println("Sum of digites : "+sum);
        
    }
    
}
