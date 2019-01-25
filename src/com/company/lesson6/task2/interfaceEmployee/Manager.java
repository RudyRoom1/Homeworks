package com.company.lesson6.task2.interfaceEmployee;

import java.util.ArrayList;

public class Manager extends Engineer implements Employable {
    ArrayList<Engineer> engineers;

    public Manager(String nameOfEngin) {
        super(nameOfEngin);
    }

    public Manager(String name, ArrayList<Engineer> engineers) {
        super(name);
        this.engineers = engineers;
    }

    @Override
    public void employeeWork() {
        System.out.println("Manager is working");
    }

    @Override
    public void comeToWork(int time) {
        super.comeToWork(time);
    }

    public void checkEngenPresents(String engineer) {
        for (Engineer entity : engineers) {
            if (entity.getName() == engineer) {
                System.out.println("Engineer in this department");
                break;
            }
            else
                System.out.println("Engineer in other department");
        }
    }
}
