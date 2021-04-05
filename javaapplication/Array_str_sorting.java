
package javaapplication;

import java.util.Arrays;

public class Array_str_sorting {
    
    public static void main(String[] args) {
        
        String[] name = {"mj","nahid","hasan","omed"};
        Arrays.sort(name);
        
        System.out.print("Asscending = ");
        for (int i = 0; i < 4; i++) {
            System.out.print(" "+name[i]);
        }
        System.out.println();
        
        System.out.print("Desscending = ");
        for (int i = 3; i >= 0; i--) {
            System.out.print(" "+name[i]);
        }
        System.out.println();
    }
    
}
