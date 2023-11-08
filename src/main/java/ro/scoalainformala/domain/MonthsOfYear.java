package ro.scoalainformala.domain;

public enum MonthsOfYear {
    MONTH1("Ianuarie", "Genar"),
    MONTH2("Februarie", "Faurar"),
    MONTH3("Martie", "Martisor"),
    MONTH4("Aprilie", "Prier"),
    MONTH5("Mai", "Florar"),
    MONTH6("Iunie", "Ciresar"),
    MONTH7("Iulie", "Cuptor"),
    MONTH8("August", "Gustar"),
    MONTH9("Septembrie", "Rapciune"),
    MONTH10("Octombrie", "Brumarel"),
    MONTH11("Noiembrie", "Brumar"),
    MONTH12("Decembrie", "Undrea");

    private String roName;
    private String popularName;

    MonthsOfYear(String roName, String popularName) {
        this.roName = roName;
        this.popularName = popularName;
    }

    public String getRoName() {
        return roName;
    }

    public String getPopularName() {
        return popularName;
    }
}
