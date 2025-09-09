package se.iths.fabian.lesson4;

public class Student {
    private String name;
    private int studentId;
    private String grade;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(studentId);
        System.out.println(grade);
    }
}
