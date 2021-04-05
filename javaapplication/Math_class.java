
package javaapplication;

public class Math_class {
    
    public static void main(String[] args) {
        
        int x=2,y=3;
        
        int max = Math.max(x, y);
        System.out.println("max = "+max);
        
        int min = Math.min(x, y);
        System.out.println("min = "+min);
        
        int abs = Math.abs(y);
        System.out.println("abs of y = "+abs);
        
        int round = Math.round(3.8f);
        System.out.println("round = "+round);
        
        double power = Math.pow(x, y);
        System.out.println("X to the power = "+power);
        
        double pi = Math.PI;
        System.out.println("Pi = "+pi);  
            
        
    }
}
