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
public class Rectangle extends ShapeAbstract{

    public Rectangle() {
        this.setColor("Red");
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle " + this.getColor() + " color.");
    }
    
    
}
