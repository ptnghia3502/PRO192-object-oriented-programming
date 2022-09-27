/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot24;

/**
 *
 * @author Nghia
 */
public class Product {

    private String code;
    private String name;
    private int size;
    private int price;

    public Product() {
    }

    public Product(String code, String name, int size, int price) {
        this.code = code;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return code + ":" + name + ":" + size + ":" + price;
    }

}
