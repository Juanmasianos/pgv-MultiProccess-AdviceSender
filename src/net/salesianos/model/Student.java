package net.salesianos.model;

public class Student {
    // "./src/net/salesianos/calcfiles/aed.csv"
    private String name;
    private String email;
    private int absences;

    public Student(String name, String email, int absences) {
        this.name = name;
        this.email = email;
        this.absences = absences;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }
    

}
