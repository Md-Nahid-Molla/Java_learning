
package javaapplication;

import java.util.Scanner;

public class Vowel_consonant {
    
    public static void main(String[] args) {
        
        char ch;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter char : ");
        ch = input.next().charAt(0); // 0 mean 0 index
        
        if(ch == 'a'){
            System.out.println("Vowel = "+ch);
        }
        else if(ch == 'e'){
            System.out.println("Vowel ="+ch);
        }
        else if(ch == 'i'){
            System.out.println("Vowel ="+ch);
        }
        else if(ch == 'o'){
            System.out.println("Vowel ="+ch);
        }
        else if(ch == 'u'){
            System.out.println("Vowel ="+ch);
        }
        else{
            System.out.println("Consonant = "+ch);
        }
    }
}
