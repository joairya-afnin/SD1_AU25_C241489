/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.largestarraynum;

/**
 *
 * @author LENOVO
 */

public class LargestArrayNum{
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 99, 45};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest number: " + max);
    }
}

