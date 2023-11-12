package ro.scoalainformala;

import ro.scoalainformala.domain.SizeChart;

public class SizeChartMain {
    public static void main(String[] args) {
        System.out.println("SIZE  SIZE NO.   BUST        WAIST");
        for (SizeChart size : SizeChart.values()) {
            System.out.println(size.name() + "    " + size.getSizeNo() + "         " + size.getBust() + "          " + size.getNaturalWaist());
        }
    }
}
