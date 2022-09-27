/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot17_1;

import sample.slot17.*;

/**
 *
 * @author Nghia
 */
public class Triangle implements ShapeInterface{

    @Override
    public void draw() {
        System.out.println("Draw Triangle " + ShapeInterface.COLOR + " color.");
    }
    
    
}
