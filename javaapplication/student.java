
package oop;

public class student {
    
    String name,gender;
    int roll; 
    double cgpa;
    
    student(){
        System.out.println("No information.");
    }
    
    student(String n,String g){         //class er name diye object make kora hoy   jake constructor bole == student
        name = n;
        gender = g;                     //student object diye akadhik object make hole overloading constoctor bole
    }
    
    student(String n, String g, int r){
        name = n;
        gender = g;
        roll = r;
    }
    student(String n, String g,int r,double cg){
        name = n;
        gender = g;
        roll = r;
        cgpa = cg;
    }
    
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Roll : "+roll);
        System.out.println("CGPA : "+cgpa);
    }
    
}
