package net.salesianos.datachecker;

import java.util.ArrayList;

import net.salesianos.model.Advice;
import net.salesianos.model.Student;

public class DataChecker {


    

    public static ArrayList<Advice> checkData(ArrayList<Student> students, String subject) {
        
        final int AEDLost = 206 * 20 / 100;
        final int DADLost = 173 * 20 / 100;
        final int PGLLost = 141 * 20 / 100;
        final int PGVLost = 96 * 20 / 100;
        final int SSGLost = 96 * 20 / 100;
        final int A10Lost = 96 * 20 / 100;

        ArrayList<Advice> advices = new ArrayList<>();

        if (subject.equals("aed")) {

            for (Student student : students) {
                
                if (student.getAbsences() >= AEDLost) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 20));
                    
                } else if (student.getAbsences() >= (AEDLost / 2)) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 10));
                    
                }
            }

        } else if (subject.equals("dad")) {

            
            for (Student student : students) {
                
                if (student.getAbsences() >= DADLost) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 20));
                    
                } else if (student.getAbsences() >= (DADLost / 2)) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 10));
                    
                }
            }

        } else if (subject.equals("pgl")) {

            
            for (Student student : students) {
                
                if (student.getAbsences() >= PGLLost) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 20));
                    
                } else if (student.getAbsences() >= (PGLLost / 2)) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 10));
                    
                }
            }

        } else if (subject.equals("pgv")) {

            
            for (Student student : students) {
                
                if (student.getAbsences() >= PGVLost) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 20));
                    
                } else if (student.getAbsences() >= (PGVLost / 2)) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 10));
                    
                }
            }

        } else if (subject.equals("ssg")) {

            
            for (Student student : students) {
                
                if (student.getAbsences() >= SSGLost) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 20));
                    
                } else if (student.getAbsences() >= (SSGLost / 2)) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 10));
                    
                }
            }


        } else if (subject.equals("a10")) {

            
            for (Student student : students) {
                
                if (student.getAbsences() >= A10Lost) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 20));
                    
                } else if (student.getAbsences() >= (A10Lost / 2)) {
                    
                    advices.add(new Advice(student.getName(), student.getEmail(), subject, 10));
                    
                }
            }

        }
        

        return null;
    }

}
