/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayaverage;

/**
 *
 * @author LENOVO
 */
public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println("Average: " + average);
    }
}
