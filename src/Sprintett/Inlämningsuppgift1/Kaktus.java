package Sprintett.Inlämningsuppgift1;

import Sprintett.Inlämningsuppgift1.Övninguppgift1A.matTyp;

public class Kaktus extends Växt {

    public Kaktus(String namn, double längd) {
        super(namn, längd, 0.2, matTyp.MINERALVATTEN);

    }

    // Polymorfism
    @Override
    public double beräknaVätskeIntag() {
        return getBasIntag();


    }
}