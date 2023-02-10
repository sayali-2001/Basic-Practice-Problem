package com.bl.practiceProblem;

// Check Armstrong Number or Not

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        int last ;
        int sum = 0;
        int num1 = num;

        while(num!=0) {
            last = num%10;
            num = num/10;
            sum = sum + (last * last * last);
        }
        if(sum == num1) {
            System.out.println(num1+ " is a Armstrong Number ");
        }
        else {
            System.out.println(num1+ " is not a Armstrong Number ");
        }
    }
}
