/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nghia
 */
public class WriteReadTextFile {

    public static void main(String[] args) {
        String fileName = "output.txt";
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
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        try {
            Product product = new Product("P01", "Banh bo", 10, 100);
            fw.write(product.toString());
            fw.write("\n");
            product = new Product("P02", "Banh da heo", 50, 200);
            fw.write(product.toString());
            fw.write("\n");
            product = new Product("P03", "Hu tieu suon", 1, 50);
            fw.write(product.toString());
            fw.write("\n");
            product = new Product("P04", "Xe dap", 20, 1000);
            fw.write(product.toString());
            fw.write("\n");
        } catch (Exception e) {
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
        return result;
    }

    public static void readFromFile(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        try {
            String line = "";
            List list = new ArrayList();
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] tmp = line.split(":");
                String code = tmp[0];
                String name = tmp[1];
                int size = Integer.parseUnsignedInt(tmp[2]);
                int price = Integer.parseUnsignedInt(tmp[3]);
                list.add(new Product(code, name, size, price));
            }
            System.out.println("List:");
            System.out.println(list.toString());
        } catch (Exception e) {
        } finally {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
    }
}
