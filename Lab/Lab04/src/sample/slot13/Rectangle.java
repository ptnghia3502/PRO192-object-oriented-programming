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
public class Rectangle {
    private int width;
    private int length;

    public int computeArea(){
        return this.getLength() * this.getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }
    
    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        this.width = width>0?width: 0;
        this.length = length>0?length: 0;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
}
