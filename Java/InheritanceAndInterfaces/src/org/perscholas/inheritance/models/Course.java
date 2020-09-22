package org.perscholas.inheritance.models;

public class Course {
    private String courseName;
    private int students;
    private String instructor;
    private String subject;

    public void setName(String courseName) {
        this.courseName = courseName;
    }

    public String getName() {
        return courseName;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getStudents() {
        return students;
    }

    public void setInstructor(String instructor) {this.instructor = instructor;}

    public String getInstructor() { return instructor; }

    public void setSubject(String subject) { this.subject = subject; }

    public String getSubject() { return subject; }

}
