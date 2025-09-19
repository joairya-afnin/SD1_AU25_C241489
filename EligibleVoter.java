/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eligiblevoter;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class EligibleVoters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people (N): ");
        int N = sc.nextInt();

        System.out.print("Enter minimum voting age (X): ");
        int X = sc.nextInt();

        int[] ages = new int[N];
        System.out.println("Enter ages of " + N + " people:");
        for (int i = 0; i < N; i++) {
            ages[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (ages[i] >= X) {
                count++;
            }
        }

        System.out.println("Number of eligible voters = " + count);
        sc.close();
    }
}