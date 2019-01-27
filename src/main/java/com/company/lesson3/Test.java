package com.company.lesson3;

import java.util.ArrayList;

public class Test {

   public ArrayList<Person> persons(){
       ArrayList<Person> personList = new ArrayList<>();
       personList.add(new Person("Andy", "Marchuk"));
       personList.add(new Person("Nast", "Isabella"));
       personList.add(new Person("Sasha", "Morsha"));
       personList.add(new Person("Masha", "Mia"));
       personList.add(new Person("Noah", "Marchuk"));
       personList.add(new Person("Vova", "Elijah"));
       personList.add(new Person("Vova", "Charlotte"));
       personList.add(new Person("Liam", "Mason"));
       personList.add(new Person("Jacob", "Olivia"));
       personList.add(new Person("Benjamin", "Sophia"));
       return personList;
   }

   public ArrayList<Person> personsList(){
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Andy", "Marchuk"));
        personList.add(new Person("Nast", "Isabella"));
        personList.add(new Person("Sasha", "Morsha"));
        personList.add(new Person("Masha", "Mia"));
        personList.add(new Person("Noah", "Marchuk"));
        personList.add(new Person("Vova", "Elijah"));
        personList.add(new Person("Vova", "Charlotte"));
        personList.add(new Person("Liam", "Mason"));
        personList.add(new Person("Jacob", "Olivia"));
        personList.add(new Person("Benjamin", "Sophia"));
        personList.add(new Person("Andy", "Marchuk"));
        personList.add(new Person("Nast", "Isabella"));
        personList.add(new Person("Sasha", "Morsha"));
        personList.add(new Person("Masha", "Mia"));
        personList.add(new Person("Noah", "Marchuk"));
        personList.add(new Person("Vova", "Elijah"));
        personList.add(new Person("Vova", "Charlotte"));
        personList.add(new Person("Liam", "Mason"));
        personList.add(new Person("Jacob", "Olivia"));
        personList.add(new Person("Benjamin", "Sophia"));
        return personList;
    }

   public Company myCompany(){
       return new Company("My",persons());
   }

}
