/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot3;

import java.util.Scanner;

/**
 *
 * @author Nghia
 */

public class Studentinformation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inout your ID: ");  //input ID
        String id = sc.nextLine();
        System.out.print("Input name: "); //input name
        String name = sc.nextLine();
        int num1 = 4;
        int num2 = 8;
        // Output on screen
        System.out.println("Student ID: " + id + " Name: " + name);
        System.out.print("Sum(" + num1 + "," + num2 + ")=" +(num1 + num2)); 
    }
}
