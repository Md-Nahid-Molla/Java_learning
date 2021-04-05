
package javaapplication;

public class Array_simple {
    
    public static void main(String[] args) {
        
        int[] array = new int[3];
        
        array[0] = 10;
        array[1] = 12;
        array[2] = 14;
        
        int len = array.length;
        int sum = array[0] + array[1] + array[2];
        
        System.out.println("Array size : "+len);
        System.out.println("Sum of array = "+sum);
    }
    
}
