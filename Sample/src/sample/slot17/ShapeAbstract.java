/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot17;

/**
 *
 * @author Nghia
 */
public abstract class ShapeAbstract {
    private String color;
    
    public ShapeAbstract() {
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public abstract void draw();
}
