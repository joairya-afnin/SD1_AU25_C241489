/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraynum;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

public class ArrayNum {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
