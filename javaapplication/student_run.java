
package oop;


public class student_run {
    
    public static void main(String[] args) {
        
        student student1 = new student();
        
        student student2 = new student("mj","male");
        student2.display();
        
        student student3 = new student("nahid","male",131446);
        student3.display();
        
        student student4 = new student("mj","male",131446,3.78);
        student4.display();
    }
    
}
