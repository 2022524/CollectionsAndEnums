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
import java.util.Map;
import java.util.HashMap;


public class CollectionsAndEnums {

    // Defining 20 team names
    private static final String[] TEAM_NAMES = {
        "Team 1", "Team 2", "Team 3", "Team 4", "Team 5",
        "Team 6", "Team 7", "Team 8", "Team 9", "Team 10",
        "Team 11", "Team 12", "Team 13", "Team 14", "Team 15",
        "Team 16", "Team 17", "Team 18", "Team 19", "Team 20"
    };
    
    public static void main(String[] args) {
        // Reading and storing the memory of the file
        List<String> lines = readTextFile("MOCK_DATA.csv");
        // Shuffle the list of data
        Collections.shuffle(lines);
        
        // Create teams
        int teamSize = 5;
        Map<String, List<String>> teams = new HashMap<>();

        // Loop through predefined team names "TEAM_NAMES"
        for (String teamName : TEAM_NAMES) {
            // Add team members from the shuffled list
            List<String> teamMembers = new ArrayList<>();
            for (int j = 0; j < teamSize; j++) {
                // Removes from list to prevent any duplicates
                teamMembers.add(lines.remove(0));
            }
            // add team to the map
            teams.put(teamName, teamMembers);
        }

        // Print each team (name and members)
        for (Map.Entry<String, List<String>> entry : teams.entrySet()) {
            String teamName = entry.getKey();
            List<String> teamMembers = entry.getValue();
            
            System.out.println("Team Name: " + teamName);
            System.out.println("Members: " + teamMembers);
        }
    }
    // Method to read the data file and return lines as a list
    public static List<String> readTextFile(String filePath) {
        List<String> lines = new ArrayList<>();
        // BufferredReader to read the file line by line
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Then the data is added to the new ArrayList "lines"
                lines.add(line);
            }
          // Try catch isnt really needed but is good practice to have anyways
        } catch (IOException e) {
        }

        return lines;
    }
}

