package ro.scoalainformala.domain;

import static java.util.Calendar.THURSDAY;

public enum WeekDays {
    DAY1("MONDAY", "LUNI", "LUNES"),
    DAY2("TUESDAY", "MARTI", "MARTES"),
    DAY3("WEDNESDAY", "MIERCURI", "MIERCOLES"),
    DAY4("THURSDAY", "JOI", "JUEVES"),
    DAY5("FRYDAY", "VINERI", "VIERNES"),
    DAY6("SATURDAY", "SAMBATA", "SABADO"),
    DAY7("SUNDAY", "DUMINICA", "DOMINGO");

    private String enDay;
    private String roDay;
    private String spDay;

    WeekDays(String enDay, String roDay, String spDay) {
        this.enDay = enDay;
        this.roDay = roDay;
        this.spDay = spDay;
    }

    public String getEnDay() {
        return enDay;
    }

    public String getRoDay() {
        return roDay;
    }

    public String getSpDay() {
        return spDay;
    }
}
