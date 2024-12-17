package src.main;

import java.io.*;
import java.util.*;

public class FileManager {
    public static List<Wrestler> loadWrestlersFromCSV(String filename) {
        List<Wrestler> wrestlers = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean isHeader = true; // Track the header row
            while ((line = br.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; // Skip the header
                    continue;
                }

                String[] fields = line.split(",");
                if (fields.length < 4) {
                    System.err.println("Invalid line: " + line);
                    continue; // Skip invalid rows
                }

                String name = fields[0];
                int seed = Integer.parseInt(fields[1].trim());
                int strength = Integer.parseInt(fields[2].trim());
                String specialty = fields[3].trim();

                wrestlers.add(new Wrestler(name, seed, strength, specialty));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number in CSV file.");
        }
        return wrestlers;
    }
}

