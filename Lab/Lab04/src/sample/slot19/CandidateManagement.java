/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot19;

import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class CandidateManagement {

    public static void main(String[] args) {
        int choice = 0;
        CandidateList list = new CandidateList();
        boolean check = true;
        do {
            Candidate cand = null;
            boolean result = false;
            String id = "";
            int index = -1;
            NghiaptUtils.showCandidateMenu();
            choice = NghiaptUtils.getInt("Input your choice:", 1, 6);
            switch (choice) {
                case 1:
                    int select = 1;
                    do {
                        NghiaptUtils.showCandidateSubMenu();
                        select = NghiaptUtils.getInt("Select candidate type:", 1, 3);
                        switch (select) {
                            case 1:
                                cand = new Experience();
                                break;
                            case 2:
                                cand = new Fresher();
                                break;
                            case 3:
                                cand = new Intern();
                                break;
                        }
                    } while (select != 1 && select != 2 && select != 3);
                    cand.create();
                    result = list.add(cand);
                    if (result) {
                        System.out.println("Add success!");
                    } else {
                        System.out.println("List is full or duplicate ID.");
                    }
                    break;
                case 2:
                    System.out.println("Update by ID:");
                    id = NghiaptUtils.getString("Input the ID that you want to update:");
                    index = list.findIndexByID(id);
                    result = list.update(index);
                    if (result) {
                        System.out.println("Update success.");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 3:
                    System.out.println("Search by ID:");
                    id = NghiaptUtils.getString("Input the ID that you want to search:");
                    cand = list.getCandidateInfo(id);
                    if (cand != null) {
                        cand.display();
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                case 4:
                    System.out.println("Delete by ID:");
                    id = NghiaptUtils.getString("Input the ID that you want to delete:");
                    String deleteConfirm = NghiaptUtils.getString("Do you want to delete? (Y/N)");
                    if ("Y".equals(deleteConfirm)) {
                        index = list.findIndexByID(id);
                        result = list.remove(index);
                        if (result) {
                            System.out.println("Delete success!");
                        } else {
                            System.out.println("Not found!");
                        }
                    }
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    String quitConfirm = NghiaptUtils.getString("Do you want to quit? (Y/N)");
                    if ("Y".equalsIgnoreCase(quitConfirm)) {
                        check = false;
                    }
                    break;
            }
        } while (check);
    }
}
