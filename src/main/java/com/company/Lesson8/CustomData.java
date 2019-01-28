package com.company.Lesson8;

import org.joda.time.DateTime;

public class CustomData {

    private static final DateTime NOW = new DateTime();



    public static String changingDateFormat(DateFormats timeFormat, String datetime) {
//        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
//        DateTime jodatime = dtf.parseDateTime(datetime);
//        DateTimeFormatter dtfOut = DateTimeFormat.forPattern(timeFormat.getDateFormat());
//        System.out.println(dtfOut.print(jodatime));
//        return dtfOut.print(jodatime);
        String data = DateTime.parse(datetime).toString(timeFormat.getDateFormat());
        System.out.println(data);
        return data;
    }

    private static long getCurrentDate(Integer... seconds) {
        if (seconds.length > 0) {
            return NOW.withTimeAtStartOfDay().plusSeconds(seconds[0]).getMillis();
        }
        return NOW.withTimeAtStartOfDay().getMillis();
    }

    public static void startDateToLong() {
        System.out.println(getCurrentDate());
    }

    public static void finishDateToLong() {
        System.out.println(getCurrentDate(86399));
    }

    public static void equalOfDate(DateTime dateTime1, DateTime dateTime2) {
        if (dateTime1.withTimeAtStartOfDay().equals(dateTime2.withTimeAtStartOfDay())) {
            System.out.println("Data is equal");
        } else {
            System.out.println("Data is not equal");
        }
    }

    private static DateTime getDateFromLong(long date) {
        return new DateTime(date);
    }

    public static String longToString(long date, DateFormats formats) {
        String res = getDateFromLong(date).toString(formats.getDateFormat());
        System.out.println(res);
        return res;
    }



    public static String dayOfWeek(long date) {
        String dayOfWeeks = getDateFromLong(date).dayOfWeek().getAsText();
        System.out.println(dayOfWeeks);
        return dayOfWeeks;
    }
}
