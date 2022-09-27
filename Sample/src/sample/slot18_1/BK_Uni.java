/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot18_1;

import sample.slot18.*;

/**
 *
 * @author Nghia
 */
public class BK_Uni implements ITSchool {
    

    @Override
    public void teachBasic() {
        System.out.println("Basic: study Pascal language.");
    }

    @Override
    public void teachAdvance() {
        System.out.println("Advance: study Data structure.");
    }

    @Override
    public void teachSpecial() {
        System.out.println("Special: study Embedded system.");
    }

    @Override
    public void showInfo() {
        System.out.println("------Welcome to Bach Khoa University------");
        this.teachBasic();
        this.teachAdvance();
        this.teachSpecial();
    } 
    
}
