package com.company.lesson4;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main.Task1();
        Main.Task2();
    }

    private static void Task1() {
        ArrayList<Student> students = new Test().listOfStudent();
        University vntu = new University("VNTU", students);
        vntu.sortByFaculty("fitki");
        vntu.sortByBirthDay(1996);
        vntu.sortByFacultyCourse("faksu", 3);
        vntu.sortByGroup("ki");
    }

    private static void Task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.nextLine();
        System.out.println(str);

        LinkedHashMap<Character, Integer> tempNumberOf = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            Integer countVal = tempNumberOf.get(value);

            if (countVal != null) {
                tempNumberOf.put(value, (countVal + 1));
            } else {
                tempNumberOf.put(value, 1);
            }
//            tempNumberOf.merge(value,countVal,(oldValue,newValue)-> );
        }

        System.out.println(tempNumberOf);


    }
}
