
package javaapplication;

import java.util.Scanner;

public class Armstrong_num {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Give on int number : ");
        int n = input.nextInt();
        
        int s = 0,temp = n;
        while(temp != 0){
            int r = temp % 10;
            s = (s+r*r*r);
            temp = temp / 10;
        }
        if(n == s){
            System.out.println("It is armstrong num : "+s);
        }
        else{
            System.out.println("Not armstorng num : "+s);
        }
    }
    
}
