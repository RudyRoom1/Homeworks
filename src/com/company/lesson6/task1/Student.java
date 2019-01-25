package com.company.lesson6.task1;

import java.time.LocalDate;

public class Student extends Person {

    private int id;
    private String phStudent;
    private Facultyes facultyStudent;
    private Courses courseStudent;
    private Groups groupStudent;

    public Student(String firstName, String lastName, String patronymic, LocalDate birthDay, String address, String phNumber, int id, Facultyes faculty, Courses courseStudent, Groups groupStudent) {
        super(firstName, lastName, patronymic, birthDay, address, phNumber);
        this.id = id;
        this.setAddress(address);
        this.phStudent = phNumber;
        this.facultyStudent = faculty;
        this.courseStudent = courseStudent;
        this.groupStudent = groupStudent;
    }

    public Student(Person person, int id, Facultyes faculty, Courses courseStudent, Groups groupStudent) {
        super(person.getFirstName(),person.getLastName(),person.getPatronymic(),person.getBirthDay(),person.getAddress(),person.getPhNumber());
        this.id = id;
        this.phStudent = person.getPhNumber();
        this.facultyStudent = faculty;
        this.courseStudent = courseStudent;
        this.groupStudent = groupStudent;
    }

    public Groups getGroupStudent() {
        return groupStudent;
    }

    public Courses getCourseStudent() {
        return courseStudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhStudent() {
        return phStudent;
    }

    public void setPhStudent(String phStudent) {
        this.phStudent = phStudent;
    }

    public Facultyes getFacultyStudent() {
        return facultyStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", phStudent='" + phStudent + '\'' +
                ", facultyStudent='" + facultyStudent + '\'' +
                ", courseStudent='" + courseStudent + '\'' +
                ", groupStudent='" + groupStudent + '\'' +
                "\n}" ;
    }
}
