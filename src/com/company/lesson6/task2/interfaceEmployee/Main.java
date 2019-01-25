package com.company.lesson6.task2.interfaceEmployee;

//Task
//3. interface Сотрудник <- class Инженер <- class Руководитель.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Main.firstTaskInterface();
    }

    public static void firstTaskInterface(){
        ArrayList<Engineer> firstList = new Test().listOfEngineers();
        Manager manager = new Manager("Carlson", firstList);
        Engineer engineer = new Engineer("Carl");

        manager.checkEngenPresents("Andy");
        ArrayList<Employable> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(engineer);

        for (Employable entity: employees) {
            entity.employeeWork();
            entity.dailyReport();
        }
        
    }
}
