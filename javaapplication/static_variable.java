
package oop;

public class static_variable {
    
    String name;
    int roll;
    static String gendar = "male";//it is static variable
    
    static_variable(String n,int r){//constoctor
        name = n;
        roll = r;
    }
    
    void dispely(){//method
        System.out.println("Name = "+name);
        System.out.println("Roll = "+roll);
        System.out.println("Gender = "+gendar);
    }
}
