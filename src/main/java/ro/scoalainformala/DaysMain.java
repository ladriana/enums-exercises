package ro.scoalainformala;

import ro.scoalainformala.domain.WeekDays;

public class DaysMain {
    public static void main(String[] args) {

        for (WeekDays days : WeekDays.values()) {
            System.out.println(days.name() + " " + days.getEnDay() + " " + days.getRoDay() + " " + days.getSpDay());
        }
    }
}
