
package javaapplication;

import java.util.Arrays;

public class Array_sorting {
    
    public static void main(String[] args) {
        
        int[] num = {2,4,521,1,56,78,0};
        
        Arrays.sort(num);
        System.out.print("Asscending =  ");
        for (int i = 0; i < 7; i++) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
        System.out.print("Desscending = ");
        for (int i = 6; i >= 0; i--) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
    }
    
}
