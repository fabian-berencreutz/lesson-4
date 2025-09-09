package se.iths.fabian.lesson4;

public class Email {
    private String to;
    private String from;
    private String subject;
    private String message;
    private String cc;

    public Email() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public void send() {
        if (to != null && from != null && subject != null && message != null) {
            System.out.println("Skickar mejl...");
            System.out.println("Till: " + to);
            System.out.println("Från: " + from);
            System.out.println("Ämne: " + subject);
            System.out.println("Meddelande: " + message);
        } else {
            throw new IllegalArgumentException("Du måste fylla i alla fält utom Cc.");
        }
        if (cc != null) {
            System.out.println("Kopia skickat till: " + cc);
        }
    }
}
