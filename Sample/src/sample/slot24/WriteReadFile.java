/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import sample.ultis.NghiaptUtils;

/**
 *
 * @author Nghia
 */
public class WriteReadFile {

    public static void main(String[] args) {
        String fileName = "data.txt";
        try {
            File file = new File(fileName);
            boolean checkExist = file.exists();
            if (checkExist == false) {
                file.createNewFile();
            }
            String content = "";
            for (int i = 0; i < 3; i++) {
                content += NghiaptUtils.getString("Content" + i + ":")+"\n";
            }
            writeToFile(fileName, content);
            readFromFile(fileName);
        } catch (Exception e) {
        }
    }

    public static boolean writeToFile(String path, String content) throws IOException {
        boolean result = false;
        BufferedWriter bw = null;
        try {
            Writer writer = new FileWriter(path);
            bw = new BufferedWriter(writer);
            bw.write(content);
            result = true;
        } catch (Exception e) {
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
        return result;
    }

    public static void readFromFile(String path) throws IOException {
        BufferedReader br = null;
        try {
            String line = "";
            br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
