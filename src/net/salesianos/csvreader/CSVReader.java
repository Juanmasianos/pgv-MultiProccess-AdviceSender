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
                    
                    students.add(new Student(fields[1], fields[2]));

                    if (fileName.equals("aed")) {

                        students.get(index - 1).setAedAbsences(Integer.parseInt(fields[3]));
                        
                    } else if (fileName.equals("dad")) {

                        students.get(index - 1).setDadAbsences(Integer.parseInt(fields[3]));

                    } else if (fileName.equals("pgl")) {

                        students.get(index - 1).setPglAbsences(Integer.parseInt(fields[3]));

                    } else if (fileName.equals("pgv")) {

                        students.get(index - 1).setPgvAbsences(Integer.parseInt(fields[3]));

                    } else if (fileName.equals("ssg")) {

                        students.get(index - 1).setSsgAbsences(Integer.parseInt(fields[3]));

                    } else if (fileName.equals("a10")) {

                        students.get(index - 1).setA10Absences(Integer.parseInt(fields[3]));

                    } 

                } 
                index++;
            }

        } catch (IOException e) {
            System.err.println("Fallo al leer el archivo");
        }

        return students;

    }

    

}