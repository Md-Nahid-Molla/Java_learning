
package javaapplication;

import java.util.Scanner;

public class Palindome_num {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int s = 0,temp = n;
        
        while(temp != 0){
            int r = temp %10;
            s = s*10 + r;
            temp = temp / 10;
        }
        if(n == s){
            System.out.println("Palindome number of : "+s);
        }
        else{
            System.out.println("It is not palindon number :"+s);
        }
        
    }
}
