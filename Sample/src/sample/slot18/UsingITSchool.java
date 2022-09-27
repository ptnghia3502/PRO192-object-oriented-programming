/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot18;

/**
 *
 * @author Nghia
 */
public class UsingITSchool {
    public static void main(String[] args) {
        
        ITSchool [] schools = new ITSchool[3];
        schools[0] = new FPT_Uni();
        schools[1] = new TDT_Uni();
        schools[2] = new BK_Uni();
        System.out.println("ITSchool information:");
        for (ITSchool school : schools) {
            school.showInfo();
        }
    }
}
