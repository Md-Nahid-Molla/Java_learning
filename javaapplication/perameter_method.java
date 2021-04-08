
package oop;

public class perameter_method {
    
    String name,deparment;
    int roll;
    
    void set(String n,String d,int r){
        name  = n;
        deparment = d;
        roll = r;
    }
    
    void display(){
        System.out.println("name = "+name);
        System.out.println("deparment = "+deparment);
        System.out.println("roll = "+roll);
    }
   
    
}
