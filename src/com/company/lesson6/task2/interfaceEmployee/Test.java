package com.company.lesson6.task2.interfaceEmployee;

import java.util.ArrayList;

public class Test {

    public ArrayList<Engineer> listOfEngineers(){
        ArrayList<Engineer> engineers = new ArrayList<>();
        engineers.add(new Engineer("Andy"));
        engineers.add(new Engineer("Body"));
        engineers.add(new Engineer("Crudy"));
        engineers.add(new Engineer("Moody"));
        engineers.add(new Engineer("Nata"));
        return  engineers;
    }


}
