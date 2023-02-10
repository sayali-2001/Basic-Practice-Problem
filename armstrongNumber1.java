package com.bl.practiceProblem;

import java.util.Scanner;

public class armstrongNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int last;
        int sum = 0;
        int i = 1;
        while (i <= num) {
            int num1 = i;
            int k = i;
            sum = 0;

            while (k != 0) {
                last = k % 10;
                k = k / 10;
                sum = sum + (last * last * last);
            }
            if (sum == i) {
                System.out.println(num1);
            }
            i++;
        }
    }
}
