package net.salesianos.csvreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import net.salesianos.model.Student;

public class CSVReader {

    public static ArrayList<Student> getData(String fileName) {

        String fileRoute = "../calcfiles/" + fileName + ".csv";
        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileRoute))) {

            String line;
            int index = 0;

            while ((line = reader.readLine()) != null) {
                    
                String[] fields = line.split(";");

                if (index != 0) {
                    
                    students.add(new Student(fields[1], fields[2], Integer.parseInt(fields[3])));

                } 
                index++;
            }

        } catch (IOException e) {
            System.err.println("Fallo al leer el archivo");
        }

        return students;

    }

    

}