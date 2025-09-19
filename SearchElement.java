/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchelement;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int search = input.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is in the array.");
        } else {
            System.out.println(search + " is NOT in the array.");
        }
    }
}
