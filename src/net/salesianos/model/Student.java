package net.salesianos.model;

public class Student {
    // "./src/net/salesianos/calcfiles/aed.csv"
    private String name;
    private String email;
    private int aedAbsences;
    private int dadAbsences;
    private int pglAbsences;
    private int pgvAbsences;
    private int ssgAbsences;
    private int a10Absences;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
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

    public int getAedAbsences() {
        return aedAbsences;
    }

    public void setAedAbsences(int aedAbsences) {
        this.aedAbsences = aedAbsences;
    }

    public int getDadAbsences() {
        return dadAbsences;
    }

    public void setDadAbsences(int dadAbsences) {
        this.dadAbsences = dadAbsences;
    }

    public int getPglAbsences() {
        return pglAbsences;
    }

    public void setPglAbsences(int pglAbsences) {
        this.pglAbsences = pglAbsences;
    }

    public int getPgvAbsences() {
        return pgvAbsences;
    }

    public void setPgvAbsences(int pgvAbsences) {
        this.pgvAbsences = pgvAbsences;
    }

    public int getSsgAbsences() {
        return ssgAbsences;
    }

    public void setSsgAbsences(int ssgAbsences) {
        this.ssgAbsences = ssgAbsences;
    }

    public int getA10Absences() {
        return a10Absences;
    }

    public void setA10Absences(int a10Absences) {
        this.a10Absences = a10Absences;
    }

    

}
