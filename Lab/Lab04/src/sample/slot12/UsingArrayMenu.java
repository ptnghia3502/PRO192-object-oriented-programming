/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot12;

import sample.slot7.IntArray;
import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class UsingArrayMenu {

    public static void main(String[] args) {
        int choice = 0;
        IntArray array = new IntArray();
        // array.setSize(4);
        boolean check = true;
        do {
            NghiaptUtils.showMenu();
            choice = NghiaptUtils.getInt("Input your choice", 1, 5);
            switch (choice) {
                case 1:
                    array.enterElements();
                    break;
                case 2:
                    array.displayElements();
                    break;
                case 3:
                    array.displaySmallest();
                    break;
                case 4:
                    array.displayAverage();
                    break;
                case 5:
                    String quit = NghiaptUtils.getString("Do you want to quit? (Y/N)");
                    if ("Y".equalsIgnoreCase(quit)) {
                        check = false;
                    }
                    break;
            }
        } while (check);
    }
}
