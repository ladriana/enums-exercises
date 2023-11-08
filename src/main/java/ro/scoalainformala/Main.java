package ro.scoalainformala;

import ro.scoalainformala.domain.WeekDays;
import ro.scoalainformala.domain.MonthsOfYear;

public class Main {
    public static void main(String[] args) {
        for (WeekDays days : WeekDays.values()) {
            System.out.println(days.name() + " " + days.getEnDay() + " " + days.getRoDay() + " " + days.getSpDay());
        }

        for (MonthsOfYear m : MonthsOfYear.values()) {
            System.out.println(m.ordinal() + " " + m.getRoName() + " " + m.getPopularName());
        }

    }
}