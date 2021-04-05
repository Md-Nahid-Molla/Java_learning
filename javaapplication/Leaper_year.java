
package javaapplication;

import java.util.Scanner;

public class Leaper_year {
    
    public static void main(String[] args) {
        
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a yera : ");
        n = input.nextInt();
        
        if(n%4 == 0){
            System.out.println("Leaper year = "+n);
        }
        else{
            System.out.println("Not Leaper year = "+n);
        }
    }
    
}
