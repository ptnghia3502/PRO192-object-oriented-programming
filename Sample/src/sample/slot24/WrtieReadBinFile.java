/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nghia
 */
public class WrtieReadBinFile {
    public static void main(String[] args) {
        String fileName = "output.dat";
        try {
            File file = new File(fileName);
            boolean checkExist = file.exists();
            if (checkExist == false) {
                file.createNewFile();
            }
            writeToFile(fileName);
            readFromFile(fileName);
        } catch (Exception e) {
        }
    }
    
    public static boolean writeToFile(String path) throws IOException {
        boolean result = false;
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            Product product = new Product("P01", "Banh bo", 10, 100);
            oos.writeObject(product.toString());
            product = new Product("P02", "Banh da heo", 50, 200);
            oos.writeObject(product.toString());
            product = new Product("P03", "Hu tieu suon", 1, 50);
            oos.writeObject(product.toString());
            product = new Product("P04", "Xe dap", 20, 1000);
            oos.writeObject(product.toString());
        } catch (Exception e) {
        } finally {
            if (oos != null) {
                oos.close();
            }
            if (fos!=null) {
                fos.close();
            }
        }
        return result;
    }

    public static void readFromFile(String path) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            Product product = null;
            List list = new ArrayList();
            while (fis.available() > 0) {
                product = (Product) ois.readObject();
                System.out.println(product.toString());
                list.add(product);
            }
            System.out.println("List:");
            System.out.println(list.toString());
        } catch (Exception e) {
        } finally {
            if (ois != null) {
                ois.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
