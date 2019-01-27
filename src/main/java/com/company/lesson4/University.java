package com.company.lesson4;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;

public class University {
    private String nameUniversity;
    private ArrayList<Student>  students;

    public University(String nameUniversity, ArrayList<Student> students) {
        this.nameUniversity = nameUniversity;
        this.students = students;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameUniversity='" + nameUniversity + '\'' +
                ", persons=" + students +
                '}';
    }

    public void sortByFaculty(String faculty){
        ArrayList<Student> resultList = new ArrayList<>();
        for (Student student: students) {
            if(student.getFacultyStudent().equals(faculty)){
                resultList.add(student);
                System.out.println(resultList.toString());
            }
        }
//        System.out.println(resultList.toString());
    }

    public void sortByFacultyCourse(String faculty, int course){
        ArrayList<Student> resultList = new ArrayList<>();
        for (Student student: students) {
            if(student.getFacultyStudent().equals(faculty) && student.getCourseStudent() == course){
                resultList.add(student);
                System.out.println(resultList.toString());
            }
        }
    }

    public void sortByBirthDay(int year){
        ArrayList<Student> resultList = new ArrayList<>();
        ChronoLocalDate yearOfBirth = LocalDate.of(year,1,1);
        for (Student student: students){
            if(student.getBirthDay().isAfter(yearOfBirth)){
                resultList.add(student);
                System.out.println(resultList.toString());
            }
        }
    }

    public void sortByGroup(String group){
        ArrayList<Student> resultList = new ArrayList<>();
        for (Student student: students){
            if(student.getGroupStudent().equals(group)){
                resultList.add(student);
                System.out.println(resultList.toString());
            }
        }
    }
}
