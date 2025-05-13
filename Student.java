// File: Student.java
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dobStr, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        this.name = name;
        this.dob = LocalDate.parse(dobStr, formatter);
    }

    public void displayInfo() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student("Rakshita", "2003-05-05", "yyyy-MM-dd");
        student.displayInfo();
    }
}