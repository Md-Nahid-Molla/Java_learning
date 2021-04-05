
package javaapplication;

public class For_each {
    
    public static void main(String[] args) {
           
        int[] num = {2,4,5,6,78,9};
        
        int sum = 0;
        
        for(int x: num){
            
            sum = sum + x;
        }
        System.out.println("Sum = "+sum);
        
    }
    
}
