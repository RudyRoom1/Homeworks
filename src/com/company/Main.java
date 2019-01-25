package com.company;

import com.company.lesson3.Company;
import com.company.lesson3.Person;
import com.company.lesson3.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person>  persons = new Test().persons();
        ArrayList<Person>  personsList = new Test().personsList();
        Company company = new Test().myCompany();
        Company companyTwo = new Test().myCompany();
        company.setEmployees(persons);
        company.setEmployees(personsList);

        System.out.println(company.countOfEmployees());
        System.out.println(companyTwo.countOfEmployees());

        company.existEmployeesByFirName("Andy");
        company.existEmployeesByFirName("andy7");
        company.existEmployeesByLastName("Charlotte");
        company.existEmployeesByLastName("andy");
        // write your code here

        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.put(1,"Andy");
        newMap.put(2,"Andy");
        newMap.put(3,"Andy");

        for (Map.Entry<Integer, String>  entry : newMap.entrySet()) {
            System.out.println(entry.getKey());
            
        }

    }
}
