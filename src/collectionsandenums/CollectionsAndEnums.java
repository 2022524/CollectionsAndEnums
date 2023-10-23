/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsandenums;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author tarq
 */
public class CollectionsAndEnums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Reading and storing the memory of the file
        List<String> lines = readTextFile("MOCK_DATA.csv");
        Collections.shuffle(lines); // Shuffle the list of data
    }
    
    public static List<String> readTextFile(String filePath) {
        List<String> lines = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
        }

        return lines;
    
    }
    

}


