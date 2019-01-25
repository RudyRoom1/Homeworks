package com.company.lesson4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Test {

//    Person personOne = new Person("Andy", "Semberg", "Prompt", LocalDate.of(1996,12,2), "Soborna","0981212");
//    Person personTwo = new Person("Sasha", "Semberg", "Prompt", LocalDate.of(1995,8,23), "Soborna","0981212");
//    Person personThree = new Person("Anton", "Semberg", "Prompt", LocalDate.of(1994,1,30), "Soborna","0981212");
//    Person personFour = new Person("Petr", "Semberg", "Prompt", LocalDate.of(1998,2,15), "Soborna","0981212");
//    Person personFive = new Person("Ivan", "Semberg", "Prompt", LocalDate.of(1996,4,5), "Soborna","0981212");
//    Person personSix = new Person("Yuri", "Semberg", "Prompt", LocalDate.of(1994,5,26), "Soborna","0981212");
//    Person personSeven = new Person("Sergio", "Semberg", "Prompt", LocalDate.of(2000,11,23), "Soborna","0981212");
//    Person personEight = new Person("Nata", "Semberg", "Prompt", LocalDate.of(1996,11,27), "Soborna","0981212");

    public ArrayList<Student> listOfStudent(){
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("Andy", "Semberg", "Prompt", LocalDate.of(1996,12,2), "Soborna","0981212", 1, "fitki", 5, "ki" ));
        student.add(new Student("Sasha", "Semberg", "Prompt", LocalDate.of(1995,8,23), "Soborna","0981212", 2, "faksu", 3, "ks" ));
        student.add(new Student("Anton", "Semberg", "Prompt", LocalDate.of(1994,1,30), "Soborna","0981212", 3, "eem", 2, "ke" ));
        student.add(new Student("Petr", "Semberg", "Prompt", LocalDate.of(1998,2,15), "Soborna","0981212", 4, "fitki", 5, "ki" ));
        student.add(new Student("Ivan", "Semberg", "Prompt", LocalDate.of(1996,4,5), "Soborna","0981212", 5, "fitki", 4, "ki" ));
        student.add(new Student("Yuri", "Semberg", "Prompt", LocalDate.of(1994,5,26), "Soborna","0981212", 6, "faksu", 3, "ks" ));
        student.add(new Student("Sergio", "Semberg", "Prompt", LocalDate.of(2000,11,23), "Soborna","0981212", 7, "faksu", 1, "ks" ));
        student.add(new Student("Nata", "Semberg", "Prompt", LocalDate.of(1996,11,27), "Soborna","0981212", 8, "fitki", 5, "ki" ));
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
