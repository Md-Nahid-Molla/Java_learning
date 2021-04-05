
package javaapplication;

import java.util.Scanner;

public class prime_num {
    
    public static void main(String[] args) {
        
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = input.nextInt();
        
        int count = 0;
        
        for(int i = 2;i < n;i++){
            
            if(n%i == 0){
                count++;
                break;
            }
           
        }
        if(count == 0){
            System.out.println("Prime number = "+n);
        }
        else {
            System.out.println("Not Prime number = "+n);
                
            }
        
    }
    
}
