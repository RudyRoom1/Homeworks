package com.company.lesson4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Student extends Person {

    private int id;
    private String phStudent;
    private String facultyStudent;
    private int courseStudent;
    private String groupStudent;

    public Student(String firstName, String lastName, String patronymic, LocalDate birthDay, String address, String phNumber, int id, String facultyStudent, int courseStudent, String groupStudent) {
        super(firstName, lastName, patronymic, birthDay, address, phNumber);
        this.id = id;
        this.setAddress(address);
        this.phStudent = phNumber;
        this.facultyStudent = facultyStudent;
        this.courseStudent = courseStudent;
        this.groupStudent = groupStudent;
    }

    public Student(Person person, int id, String facultyStudent, int courseStudent, String groupStudent) {
        super(person.getFirstName(),person.getLastName(),person.getPatronymic(),person.getBirthDay(),person.getAddress(),person.getPhNumber());
        this.id = id;
        this.phStudent = person.getPhNumber();
        this.facultyStudent = facultyStudent;
        this.groupStudent = groupStudent;
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

    public String getFacultyStudent() {
        return facultyStudent;
    }

    public void setFacultyStudent(String facultyStudent) {
        this.facultyStudent = facultyStudent;
    }

    public int getCourseStudent() {
        return courseStudent;
    }

    public void setCourseStudent(int courseStudent) {
//        if(courseStudent <= 5 && courseStudent >= 1)
        this.courseStudent = courseStudent;
//        System.out.println("Enter other number in range 1 - 5");
    }

    public String getGroupStudent() {
        return groupStudent;
    }

    public void setGroupStudent(String groupStudent) {
        this.groupStudent = groupStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", phStudent='" + phStudent + '\'' +
                ", facultyStudent='" + facultyStudent + '\'' +
                ", courseStudent='" + courseStudent + '\'' +
                ", groupStudent='" + groupStudent + '\'' +
                '}' + '\n';
    }
}
