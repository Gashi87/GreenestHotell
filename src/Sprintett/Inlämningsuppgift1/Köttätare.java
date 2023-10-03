package Sprintett.Inlämningsuppgift1;

import Sprintett.Inlämningsuppgift1.Övninguppgift1A.matTyp;

public class Köttätare extends Växt {

    private static double extraVätskeIntag = 0.2;

    public Köttätare(String namn, double längd) {
        super(namn, längd, 0.1, matTyp.PROTEINDRYCK);

    }

    // Polymorfism
    @Override
    public double beräknaVätskeIntag() {
        return getBasIntag() + (extraVätskeIntag * getLängd());

    }
}

