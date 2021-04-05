package javaapplication;

import java.util.Scanner;

public class Array_sum_average {

    public static void main(String[] args) {

        int sum = 0;

        Scanner input = new Scanner(System.in);

        double[] num = new double[5];
        System.out.print("Please enter 5 number : ");

        for (int i = 0; i < 5; i++) {
            num[i] = input.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            sum = (int) (sum + num[i]);
        }
        int len = num.length;
        int avg = sum / len;
        System.out.println("Sum of array = " + sum);
        System.out.println("Sum of average = " + avg);

    }

}
