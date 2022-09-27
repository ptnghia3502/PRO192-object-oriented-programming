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
public class UsingShape {
    public static void main(String[] args){
        //shape dong vai tro la Rectangle
        ShapeAbstract shape = new Rectangle();
        shape.draw();
        //shape dong vai tro la Triangle
        shape = new Triangle();
        shape.draw();
        //shape dong vai tro la Circle
        shape = new Circle();
        shape.draw();
    }
}
