/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot13;

/**
 *
 * @author Nghia
 */
public class Using {
    public static void main(String[] args){
        Rectangle rec= new Rectangle(2, 3);
        System.out.println(rec.toString());
        System.out.println("Area = "+ rec.computeArea());
        // box
        Box box = new Box(2, 3, 4);
        System.out.println(box.toString());
        System.out.println("Area = " + box.computeArea());
        System.out.println("Volum = " + box.computeVolum());
    }
}
