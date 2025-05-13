
// File: StudentCourses.java
public class StudentCourses {
    private String[] semester1 = {"Math", "Physics", "Chemistry"};
    private int[] marks1 = {85, 90, 88};

    private String[] semester2 = {"Biology", "English", "CS"};
    private int[] marks2 = {80, 89, 95};

    public void displayCourses() {
        System.out.println("Semester 1 Courses and Marks:");
        for (int i = 0; i < semester1.length; i++) {
            System.out.println(semester1[i] + ": " + marks1[i]);
        }

        System.out.println("\nSemester 2 Courses and Marks:");
        for (int i = 0; i < semester2.length; i++) {
            System.out.println(semester2[i] + ": " + marks2[i]);
        }
    }

    public static void main(String[] args) {
        StudentCourses sc = new StudentCourses();
        sc.displayCourses();
    }
}