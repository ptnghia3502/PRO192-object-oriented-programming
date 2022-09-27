/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.ultis;

import java.util.Scanner;

/**
 *
 * @author Nghia
 */
public class NghiaptUtils {

    public static int getInt(String welcome, int min, int max) {
        int number = 0;
        boolean check = true;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                number = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.print("Input Interger!\n");
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static int getInt(String welcome, int min, int max, int oldData) {
        int number = oldData;
        boolean check = true;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    number = Integer.parseInt(tmp);
                    check = false;
                }
            } catch (Exception e) {
                System.out.print("Input Interger!\n");
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static String getString(String welcome) {
        String result = "";
        boolean check = true;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("Input text!!!");
            } else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static String getString(String welcome, String oldData) {
        String result = oldData;
        Scanner sc = new Scanner(System.in);
        System.out.print(welcome);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            result = tmp;
        }
        return result;
    }
    
    public static void showMenu() {
        System.out.println("==============================");
        System.out.println("Welcome to Array Management");
        System.out.println("Select your choice:");
        System.out.println("1. Enter elements");
        System.out.println("2. Display array");
        System.out.println("3. Sort array");
        System.out.println("4. Find index");
        System.out.println("5. Quit");
        System.out.println("==============================");
    }
    
    public static void showCandidateMenu() {
        System.out.println("==============================");
        System.out.println("Welcome to Candidate Management");
        System.out.println("Select your choice:");
        System.out.println("1. Add candidate");
        System.out.println("2. Update by ID");
        System.out.println("3. Search by ID");
        System.out.println("4. Remove by ID");
        System.out.println("5. Display");
        System.out.println("6. Quit");
        System.out.println("==============================");
    }
     
    public static void showCandidateSubMenu() {
        System.out.println("Select candidate type:");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intern");
    }
}
