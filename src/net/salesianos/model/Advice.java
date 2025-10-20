package net.salesianos.model;

public class Advice {
    
    private String name;
    private String email;
    private String subject;
    private int percentage;

    public Advice(String name, String email, String subject, int percentage) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    public int getPercentage() {
        return percentage;
    }

    

}
