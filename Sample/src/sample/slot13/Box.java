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
public class Box extends Rectangle{
    private int height;
    
    public int computeVolum() {
        return this.getLength() * this.getWidth() * this.getHeight();
    }

    public int computArea(){
        return 2*(this.getHeight() * this.getLength() +
                this.getHeight() * this.getWidth() +
                this.getLength() * this.getWidth());
    }

    @Override
    public String toString() {
        return "Box{" +"width=" +this.getWidth()+", length="+ this.getLength()+
                   ", height=" + height + '}';
    }
    
    public Box() {
    }

    public Box(int height) {
        this.height = height;
    }

    public Box(int height, int width, int length) {
        super(width, length);
        this.height = height>0?height: 0;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
}
