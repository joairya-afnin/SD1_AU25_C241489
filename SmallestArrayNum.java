/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smallestarraynum;

/**
 *
 * @author LENOVO
 */
public class SmallestArrayNum {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 99, 45};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest number: " + min);
    }
}
