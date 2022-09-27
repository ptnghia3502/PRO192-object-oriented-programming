/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytools;

import java.util.Scanner;

/**
 *
 * @author Nghia
 */
public class NghiaUtils {
    
    //--- 1. Nhập số nguyên
    public static int getInt(String welcome) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean cont = true;
        do
        try {
            System.out.print(welcome);
            value = Integer.parseInt(sc.nextLine());
            cont = false;
        } catch (Exception e) {
            System.out.println("Retype an integer: ");
        } while (cont == true);
        return value;
    }
    
    //--- 2. Nhập số nguyên, kèm giá trị cũ
    public static int getInt(String message, int oldData) {
        Scanner sc = new Scanner(System.in);
        String tmp;
        int value = 0;
        boolean cont = true;
        do
        try {
            System.out.print(message);
            tmp = sc.nextLine();
            if (tmp.isEmpty()) { //neu khong nhap thi gan gtr cu
                value = oldData;
            } else {
                value = Integer.parseInt(tmp);
            }
            cont = false;
        } catch (Exception e) {
            System.out.println("Retype an integer: ");
        } while (cont == true);
        return value;
    }
    
    //--- 3. Nhập số thực
    public static double getDouble(String welcome) {
        Scanner sc = new Scanner(System.in);
        double value = 0;
        boolean cont = true;
        do
        try {
            System.out.print(welcome);
            value = Double.parseDouble(sc.nextLine());
            cont = false;
        } catch (Exception e) {
            System.out.println("Retype an double: ");
        } while (cont == true);
        return value;
    }
    
    //--- 4. Nhập số thực, kèm giá trị cũ
    public static double getDouble(String message, double oldData) {
        Scanner sc = new Scanner(System.in);
        String tmp;
        double value = 0;
        boolean cont = true;
        do
        try {
            System.out.print(message);
            tmp = sc.nextLine();
            if (tmp.isEmpty()) { //neu khong nhap thi gan gtr cu
                value = oldData;
            } else {
                value = Double.parseDouble(tmp);
            }
            cont = false;
        } catch (Exception e) {
            System.out.println("Retype an double: ");
        } while (cont == true);
        return value;
    }
    
    //--- 5. Nhập số nguyên, có giới hạn giá trị min max
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
    
    //--- 6. Nhập chuỗi
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
    
    //--- 7. Nhập chuỗi, kèm giá trị cũ
    public static String getString(String message, String oldData) {
        Scanner sc = new Scanner(System.in);
        String str;
        boolean cont = true;
        do {
            System.out.print(message);
            str = sc.nextLine();
            if (str.isEmpty()) {//neu khong nhap thi gan gtr cu
                str = oldData;
            }
            cont = false;
        } while (cont == true);
        return str;
    }
    
    //--- 8. Xác nhận Yes/No
    public static boolean confirmYesNo(String welcome) {
        boolean result = false;
        String confirm = NghiaUtils.getString(welcome);
        if ("Y".equalsIgnoreCase(confirm)) {
            result = true;
        }
        return result;
    }
    
    //--- 8. Xác nhận Yes/No, kèm giá trị cũ
    public static boolean confirmYesNo(String welcome, boolean oldData) {
        boolean result = false;
        String confirm = NghiaUtils.getString(welcome);
        if (confirm.isEmpty()) {//neu khong nhap thi gan gtr cu
            result = oldData;
            return result;
        }
        if ("Y".equalsIgnoreCase(confirm)) {
            result = true;
        }
        return result;
    }
    
    //--- 9. Xác nhận giới tính
    public static boolean confirmGender(String welcome, boolean oldData) {
        boolean result = false;
        String confirm = NghiaUtils.getString(welcome);
        if (confirm.isEmpty()) {//neu khong nhap thi gan gtr cu
            result = oldData;
            return result;
        }
        if ("M".equalsIgnoreCase(confirm)) {
            result = true;
        }
        return result;
    }
    
    //--- 10. Menu nhỏ (thay đổi thành phần trong menu)
    public static void smallMenu() {
        System.out.println("You are: ");
        System.out.println("1. Employee");
        System.out.println("2. Manager");
    }
}
