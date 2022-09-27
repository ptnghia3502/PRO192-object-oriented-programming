/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dto;

import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class IntArray {

    private final int size;
    private int[] elements;

    public IntArray() {
        this.size= NghiaptUtils.getInt("Input size: ", 1, 100);
    }

    public IntArray(int size, int[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public int getSize(){
        return size;
    }
    
    public void enterElement(){
        if (elements==null) {
            elements= new int[size];
        }
        System.out.println("Enter elements: ");
        for (int i =0; i<size; i++) {
            elements[i] = NghiaptUtils.getInt("Element["+i+"]", -100, 100);
        }
    }
    
    public void display(){
        if(elements==null){
            System.out.println("Array is empty!");
            return;
        }
        for (int element : elements) {
            System.out.print(element+" ");
        }
        System.out.print("\n");
    }
    
    public void sort(){
        if(elements==null) {
            System.out.println("Array is empty!");
            return;
        }
        System.out.println("Sorting..........");
        for (int i= 0; i<size -1; i++) {
            for (int j=i; j<size; j++){
                if (elements[i] > elements[j]) {
                    int tmp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = tmp;
                }
            }
        }
        System.out.println("Sorted!");
        System.out.println("Please choose option 2 to display!");
    }
    
    public void findIndex(int value) {
        int tmp=0;
        if (elements == null) {
            System.out.println("Array is empty!");
            return;
        }
        for (int i=0; i<size; i++){
            if (elements[i] == value) {
                System.out.println("Found " + value +" at "+ (i+1));
                tmp++;
            }
        }
        if (tmp==0) System.out.println("The value dose not exist in the array!");
    }
    
}