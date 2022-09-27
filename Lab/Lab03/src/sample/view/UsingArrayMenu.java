/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.view;

import sample.dto.IntArray;
import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class UsingArrayMenu {

    public static void main(String[] args) {
        int choice = 0;
        IntArray array = new IntArray();
        boolean check = true;
        do {
            NghiaptUtils.showMenu();
            choice = NghiaptUtils.getInt("Input your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    array.enterElement();
                    break;
                case 2:
                    array.display();
                    break;
                case 3:
                    array.sort();
                    break;
                case 4:
                    int value = NghiaptUtils.getInt("Value want to search: ", -100, 100);
                    array.findIndex(value);
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
