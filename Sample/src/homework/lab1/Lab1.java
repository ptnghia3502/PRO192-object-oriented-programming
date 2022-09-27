/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.lab1;

import java.util.Scanner;

/**
 * User enters the size of the array The user enters each element of the array
 * Display the value of each element in the array Find the smallest element in
 * the array and display it on the screen Calculate the average value of the
 * array
 *
 * @author Nghia
 */
public class Lab1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();    //Nhap so phan tu
        int[] arr = new int[n];
        int min;
        //Nhap gia tri moi phan tu
        System.out.print("Enter each element of array: \n");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Hien thi cac phan tu ra man hinh
        System.out.print("Value of elements in the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //Tim so nho nhat trong mang
        min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("\nThe smallest element in the array is: " + min);
        // Tinh gia tri trung binh cua mang
        double average;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        average = sum / n;
        System.out.print("\nAverage = " + average);
    }
}
