package com.company.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person>  persons = new Test().persons();
        Company company = new Test().myCompany();
        Company companyTwo = new Test().myCompany();
        company.setEmployees(persons);

        System.out.println(company.countOfEmployees());
        System.out.println(companyTwo.countOfEmployees());

        company.existEmployeesByFirName("Andy");
        company.existEmployeesByFirName("andy7");
        company.existEmployeesByLastName("Charlotte");
        company.existEmployeesByLastName("andy");
        // write your code here
    }
}
