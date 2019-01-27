package com.company.lesson3;

import java.util.ArrayList;

public class Company {

    private String companyNames;
    private ArrayList<Person> employees;

    public Company(String companyNames, ArrayList<Person> employees) {
        this.companyNames = companyNames;
        this.employees = employees;
    }

    public void setCompanyNames(String companyNames) {
        this.companyNames = companyNames;
    }

    public void setEmployees(ArrayList<Person> employees) {
        this.employees = employees;
    }

    public String getCompanyNames() {
        return companyNames;
    }

    public ArrayList<Person> getEmployees() {
        return employees;
    }

    public Company(String companyNames) {
        this.companyNames = companyNames;
    }

    public int countOfEmployees(){
        return employees.size();
    }

    public void existEmployeesByFirName(String firstNameEmployees){
        for (Person person : employees){
            if (person.getFirstName().toLowerCase().contains(firstNameEmployees.toLowerCase())){
                System.out.println("An employee with that name exists");
                break;
            }
            else {
                System.out.println("An employee with that name dose not exists ");
                break;
            }
        }
    }

    public void existEmployeesByLastName(String lastNameEmployees){
        for (Person person : employees){
            if (person.getLastName().toLowerCase().contains(lastNameEmployees.toLowerCase())){
                System.out.println("An employee with that last name exists");
                break;
            }
            else {
                System.out.println("An employee with that last name dose not exists ");
                break;
            }
        }
    }
}
