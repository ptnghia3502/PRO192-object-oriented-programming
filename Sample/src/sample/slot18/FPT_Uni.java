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
public class FPT_Uni extends ITSchool {

    public FPT_Uni() {
        this.setName("------Welcome to FPT Univetsity------");
    }

    @Override
    public void teachBasic() {
        System.out.println("Basic: study C language.");
    }

    @Override
    public void teachAdvance() {
        System.out.println("Advance: study Web application.");
    }

    @Override
    public void teachSpecial() {
        System.out.println("Special: study Sofeware Engineering.");
    }

   /* @Override
    public void showInfo() {
        System.out.println(this.getName());
        this.teachBasic();
        this.teachAdvance();
        this.teachSpecial();
    } */
    
    
}
