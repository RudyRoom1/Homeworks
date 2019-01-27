package com.company.lesson6.task1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

    Person personOne = new Person("Andy", "Semberg", "Prompt", LocalDate.of(1996,12,2), "Soborna","0981212");
    Person personTwo = new Person("Sasha", "Semberg", "Prompt", LocalDate.of(1995,8,23), "Soborna","0981212");
    Person personThree = new Person("Anton", "Semberg", "Prompt", LocalDate.of(1994,1,30), "Soborna","0981212");
    Person personFour = new Person("Petr", "Semberg", "Prompt", LocalDate.of(1998,2,15), "Soborna","0981212");
    Person personFive = new Person("Ivan", "Semberg", "Prompt", LocalDate.of(1996,4,5), "Soborna","0981212");
    Person personSix = new Person("Yuri", "Semberg", "Prompt", LocalDate.of(1994,5,26), "Soborna","0981212");
    Person personSeven = new Person("Sergio", "Semberg", "Prompt", LocalDate.of(2000,11,23), "Soborna","0981212");
    Person personEight = new Person("Nata", "Semberg", "Prompt", LocalDate.of(1996,11,27), "Soborna","0981212");

    public ArrayList<Student> listOfStudent(){
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Andy", "Semberg", "Prompt", LocalDate.of(1996,12,2), "Soborna","0981212", 1, Facultyes.FEEM, Courses.FIRST, Groups.KI ));
        student.add(new Student("Sasha", "Semberg", "Prompt", LocalDate.of(1995,8,23), "Soborna","0981212", 2, Facultyes.FITKI, Courses.FOURTH, Groups.KM ));
        student.add(new Student("Anton", "Semberg", "Prompt", LocalDate.of(1994,1,30), "Soborna","0981212", 3, Facultyes.FEEM, Courses.SECOND, Groups.KM ));
        student.add(new Student("Petr", "Semberg", "Prompt", LocalDate.of(1998,2,15), "Soborna","0981212", 4, Facultyes.FRAU, Courses.SIXTH, Groups.PI));
        student.add(new Student("Ivan", "Semberg", "Prompt", LocalDate.of(1996,4,5), "Soborna","0981212", 5, Facultyes.FITKI, Courses.SECOND, Groups.PI ));
        student.add(new Student("Yuri", "Semberg", "Prompt", LocalDate.of(1994,5,26), "Soborna","0981212", 6, Facultyes.FEEM, Courses.THIRD, Groups.KM ));
        student.add(new Student("Sergio", "Semberg", "Prompt", LocalDate.of(2000,11,23), "Soborna","0981212", 7, Facultyes.FEEM, Courses.SECOND, Groups.PI ));
        student.add(new Student("Nata", "Semberg", "Prompt", LocalDate.of(1996,11,27), "Soborna","0981212", 8, Facultyes.FITKI, Courses.THIRD, Groups.KI ));
        student.add(new Student(personSeven,9,Facultyes.FITKI, Courses.THIRD, Groups.KI ));
        return student;
    }

//    public HashSet<String> listOfFaculty(){
//        HashSet<String> facultyStudents = new HashSet<String>();
//        facultyStudents.add("fitki");
//        facultyStudents.add("faksu");
//        facultyStudents.add("eem");
//        return  listOfFaculty();
//    }

}
