package com.company.course;

public class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course()
    {
        this("N/A", null, null);
    }

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void printCourseInfo() {
        System.out.println("\nCourse Name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthorName() + ", Publisher: " + textbook.getPublisher() + "\n");
    }
}
