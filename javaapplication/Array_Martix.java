package javaapplication;

import java.util.Scanner;

public class Array_Martix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        
        //insart a
        System.out.println("Enter elements for A martix : ");

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] = ", row, col);
                a[row][col] = input.nextInt();
            }
        }
        //insart b
        System.out.println("Enter elements for B martix : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d] = ", row, col);
                b[row][col] = input.nextInt();
            }
        }
        //output a
        System.out.println();
        System.out.print("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+a[row][col]);
            }
            System.out.println();
        }
        System.out.println();
        //output b
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+b[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n\n");
        //add a and b
        
        System.out.print("A+B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t "+(a[row][col] + b[row][col]));
            }
            System.out.println();
        }
    }

}
