
package javaapplication;

import java.util.Scanner;

public class Sum_m_n_even {
    
    public static void main(String[] args) {
        
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter m and n : ");
        m = input.nextInt();
        n = input.nextInt();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if(i%2 == 0){
                sum = sum+i;
            }
            
            
        }
        System.out.println("Even sum = "+sum);
    }
    
}
