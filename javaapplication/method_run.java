
package oop;

public class method_run {
    
    public static void main(String[] args) {
        
        method student = new method();
        student.name = "mj";
        student.gender = "male";
        student.phone = 1998555201;
        
        student.display();
        System.out.println();
        
        method student1 = new method();
        student1.name = "nahid";
        student1.gender = "male";
        student1.phone = 1998555201;
        
        student1.display();
    }
    
}
