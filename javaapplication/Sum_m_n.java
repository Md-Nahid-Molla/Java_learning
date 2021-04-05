
package javaapplication;

import java.util.Scanner;


public class Sum_m_n {
    
    public static void main(String[] args) {
        
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter M and N number : ");
        m = input.nextInt();
        n = input.nextInt();
        int i,sum = 0;
        
        for (i = m;i <= n;i++) {
            sum +=i;
            
        }
        System.out.println("Sum m to n value : "+sum);
    }
    
}
