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

    // Defining 20 team names
    private static final String[] TEAM_NAMES = {
        "Team 1", "Team 2", "Team 3", "Team 4", "Team 5",
        "Team 6", "Team 7", "Team 8", "Team 9", "Team 10",
        "Team 11", "Team 12", "Team 13", "Team 14", "Team 15",
        "Team 16", "Team 17", "Team 18", "Team 19", "Team 20"
    };
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Reading and storing the memory of the file
        List<String> lines = readTextFile("MOCK_DATA.csv");
        
        // Shuffle the list of data
        Collections.shuffle(lines);
    
        // Create teams
        int teamSize = 5;
        int totalTeams = 20;
        List<List<String>> teams = new ArrayList<>();

        for (int i = 0; i < totalTeams; i++) {
            List<String> team = new ArrayList<>();
            for (int j = 0; j < teamSize; j++) {
                team.add(lines.remove(0));
            }
            teams.add(team);
        }

        // Display teams
        for (int i = 0; i < teams.size(); i++) {
            System.out.println("Team " + (i + 1) + ": " + teams.get(i));
        }
    }
    
    public static List<String> readTextFile(String filePath) {
        List<String> lines = new ArrayList<>();
        // BufferedReader to read the file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Then the data is added to the new ArrayList "Lines"
                lines.add(line);
            }
        } catch (IOException e) {
        }

        return lines;
    }
}

