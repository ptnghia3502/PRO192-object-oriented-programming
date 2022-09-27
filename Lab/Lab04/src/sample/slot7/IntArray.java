/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot7;

import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class IntArray {

    int size;
    int[] elements;
    int smallest;
    double average;

    void enterSize() {
        size = NghiaptUtils.getInt("Enter size:", 1, 10);
    }

    public void enterElements() {
        if (elements == null) {
            elements = new int[size];
        }
        System.out.println("Input elements:");
        for (int i = 0; i < size; i++) {
            elements[i] = NghiaptUtils.getInt("Elements[" + i + "]", -10, 10);
        }
    }

     public void displayElements() {
        System.out.println("Display elements");
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }

    int findSmallest() {
        if (elements != null) {
            smallest = elements[0];
        }
        smallest = elements[0];
        for (int element : elements) {
            if (smallest > element) {
                smallest = element;
            }
        }
        return smallest;
    }

    public void displaySmallest() {
        System.out.println("Smallest=" + smallest);
    }

    double calculateAverage() {
        average = 0;
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        average = (double) sum / size;
        return average;
    }

    public void displayAverage() {
        System.out.println("Average=" + average);
    }
}
