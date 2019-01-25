package com.company.task2.interfaceEmployee;

public class Engineer implements Employable {
    private String name;

    public Engineer(String name) {
        this.name = name;
    }

    @Override
    public void employeeWork() {
        System.out.println("Engineer is working");
    }

    @Override
    public void comeToWork(int time) {
        if(time <= 10)
            System.out.println("Engineer сame on time");
        else
            System.out.println("Engineer was late");
    }

    public String getName() {
        return name;
    }
}
