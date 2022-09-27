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
public abstract class ITSchool {
    private String name;
    
    public ITSchool (){
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void teachBasic();
    public abstract void teachAdvance();
    public abstract void teachSpecial();
   // public abstract void showInfo();
    
    public void showInfo() {
        System.out.println(this.getName());
        this.teachBasic();
        this.teachAdvance();
        this.teachSpecial();
    }
}
