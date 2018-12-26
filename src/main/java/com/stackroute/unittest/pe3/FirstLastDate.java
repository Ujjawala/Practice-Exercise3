package com.stackroute.unittest.pe3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FirstLastDate {
    public static void main(String[] arg) {
        FirstLastDate firstLastDate = new FirstLastDate();
        System.out.println(firstLastDate.date());
    }
    public String date() {
        final DayOfWeek firstDayOfWeek = WeekFields.of(Locale.CHINA).getFirstDayOfWeek();
        final DayOfWeek lastDayOfWeek = DayOfWeek.of(((firstDayOfWeek.getValue() + 5) % DayOfWeek.values().length) + 1);
        return "Sun " + LocalDate.now(/* tz */).with(TemporalAdjusters.previousOrSame(firstDayOfWeek)) + "\nSat " + LocalDate.now(/* tz */).with(TemporalAdjusters.nextOrSame(lastDayOfWeek));
    }
}
