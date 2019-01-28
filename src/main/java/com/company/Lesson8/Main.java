package com.company.Lesson8;

import org.joda.time.DateTime;

public class Main {

    public static void main(String[] args) {
        CustomData.changingDateFormat(DateFormats.FIRST_FORMAT, "2019-01-23");
        CustomData.changingDateFormat(DateFormats.SECOND_FORMAT, "2019-01-23");
        CustomData.startDateToLong();
        CustomData.finishDateToLong();
        DateTime data2 = new DateTime(2012, 12, 07, 0, 0);
        DateTime data1 = new DateTime(2012, 11, 07, 0, 1);
        CustomData.equalOfDate(data1, data2);
        CustomData.longToString(1548626400000L, DateFormats.FIRST_FORMAT);
        CustomData.dayOfWeek(1548760259000L);
    }
}
