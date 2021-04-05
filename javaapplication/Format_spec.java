
package javaapplication;

public class Format_spec {
    public static void main(String[] args) {
        boolean b = true;
        char c = 'n'; //dynamic initialition
        short s = 446;
        int n = 131446;
        float f = 10.2f;
        double d = 3.50;
        
        
        System.out.printf("Boolean = %b\n",b);
        System.out.printf("Char = %c\n",c);
        System.out.printf("Short = %s\n",s);
        System.out.printf("Int = %d\n",n);
        System.out.printf("Float = %.2f\n",f);//%.2f means-- . por 2 number
        System.out.printf("Double = %.3f\n",d);
    }
    
}
