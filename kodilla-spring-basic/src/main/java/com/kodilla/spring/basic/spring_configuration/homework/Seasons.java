package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;
import java.time.Month;

public class Seasons {
    public static String getSeason(LocalDate date) {

        Month month = date.getMonth();

        if (month == Month.DECEMBER || month == Month.JANUARY || month == Month.FEBRUARY) {
            return "Winter";
        } else if (month == Month.MARCH || month == Month.APRIL || month == Month.MAY) {
            return "Spring";
        } else if (month == Month.JUNE || month == Month.JULY || month == Month.AUGUST) {
            return "Summer";
        } else {
            return "Autumn";
        }
    }
}
