package com.company.course;

public class DriverCourse
{
    public static void main(String[] args) {
        System.out.println("\nAGGREGATION");
        Instructor nimaDavarpanahInstructor = new Instructor();
        nimaDavarpanahInstructor.setFirstName("Nima");
        nimaDavarpanahInstructor.setLastName("Davarpanah");
        nimaDavarpanahInstructor.setOfficeNumber("3-2636");

        Instructor nicoleJonesInstructor = new Instructor();
        nicoleJonesInstructor.setFirstName("Nicole");
        nicoleJonesInstructor.setLastName("Jones");
        nicoleJonesInstructor.setOfficeNumber("5-1021");

        Textbook cleanCodeTextBook = new Textbook();
        cleanCodeTextBook.setTitle("Clean Code");
        cleanCodeTextBook.setAuthorName("Robert C. Martin");
        cleanCodeTextBook.setPublisher("Prentice Hall");

        Textbook textbook2 = new Textbook();
        textbook2.setTitle("History of the U.S. Third Edition");
        textbook2.setAuthorName("Albert Holmes");
        textbook2.setPublisher("US History Hall");


        Course cs4800Course = new Course();
        Course hst2022Course = new Course();

        cs4800Course.setCourseName("CS 4800 - Software Engineering");
        hst2022Course.setCourseName("HST 2022 - U.S. History");

        cs4800Course.setInstructor(nimaDavarpanahInstructor);
        hst2022Course.setInstructor(nicoleJonesInstructor);

        cs4800Course.setTextbook(cleanCodeTextBook);
        hst2022Course.setTextbook(textbook2);

        cs4800Course.printCourseInfo();
        hst2022Course.printCourseInfo();
    }
}
