package com.bl.practiceProblem;

//Find the Sum of First N Natural Numbers in Java

public class NaturalNumber {
    public static void main(String args[]){
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
