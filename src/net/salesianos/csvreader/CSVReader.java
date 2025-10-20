package net.salesianos.csvreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import net.salesianos.model.Student;

public class CSVReader {

    public static ArrayList<Student> getData(String fileName) {

        String fileRoute = "./src/net/salesianos/calcfiles/" + fileName + ".csv";
        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileRoute))) {

            String line;
            int index = 0;

            while ((line = reader.readLine()) != null) {
                    
                String[] fields = line.split(";");

                if (index != 0) {
                    
                    students.add(new Student(fields[0], fields[1], Integer.parseInt(fields[2])));

                } 
                index++;
            }

        } catch (IOException e) {
            System.err.println("Fallo al leer el archivo");
            e.printStackTrace();
        }

        return students;

    }

    

}