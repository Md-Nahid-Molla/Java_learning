
package javaapplication;

import java.util.Scanner;

public class Array_max_min {
    public static void main(String[] args) {
        
          int sum = 0;

        Scanner input = new Scanner(System.in);

        double[] num = new double[5];
        System.out.print("Please enter 5 number : ");

        for (int i = 0; i < 5; i++) {
            num[i] = input.nextDouble();
        }
        
        double max = num[0];
        double min = num[0];
        for (int i = 1; i < 5; i++) {
            
            if(max < num[i]){
                max = num[i];
            }
            else if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println("Max number of array = "+max);
        System.out.println("Min number of array = "+min);
        
    }
    
}
