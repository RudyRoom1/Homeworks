package com.company.lesson6.task2.interfaceEmployee;

public interface Employable {
    void comeToWork(int time);
    void employeeWork();
    default void dailyReport(){
        System.out.println("Daily report was created");
    }
}
