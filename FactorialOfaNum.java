/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialofanum;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class FactorialOfaNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial is: " + fact);
    }
}
