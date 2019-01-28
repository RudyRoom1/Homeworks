package com.company.Lesson8;

public enum DateFormats {
    FIRST_FORMAT("dd-MM-yyyy"),
    SECOND_FORMAT("dd/MM/yyyy")
    ;

    DateFormats(String dateTime){
        this.dateFormat  = dateTime;
    }
    private final String dateFormat;

    public String getDateFormat() {
        return dateFormat;
    }
}
