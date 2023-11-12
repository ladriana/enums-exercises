package ro.scoalainformala.domain;

public enum SizeChart {
    XXS("00", "32", "24"),
    XS("0-2", "33-34", "25-26"),
    S("4-6", "35-36", "27-28"),
    M("8-10", "37-38", "29-30"),
    L("12-14", "39-40", "31-32"),
    XL("16", "41", "33");
    private String sizeNo;
    private String bust;
    private String naturalWaist;

    SizeChart(String sizeNo, String bust, String naturalWaist) {
        this.sizeNo = sizeNo;
        this.bust = bust;
        this.naturalWaist = naturalWaist;
    }

    public String getSizeNo() {
        return sizeNo;
    }

    public void setSizeNo(String sizeNo) {
        this.sizeNo = sizeNo;
    }

    public String getBust() {
        return bust;
    }

    public void setBust(String bust) {
        this.bust = bust;
    }

    public String getNaturalWaist() {
        return naturalWaist;
    }

    public void setNaturalWaist(String naturalWaist) {
        this.naturalWaist = naturalWaist;
    }

}
