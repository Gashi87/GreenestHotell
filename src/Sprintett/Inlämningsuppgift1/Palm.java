package Sprintett.Inlämningsuppgift1;

import Sprintett.Inlämningsuppgift1.Övninguppgift1A.matTyp;

import javax.swing.*;

public class Palm extends Växt {

    public Palm(String namn, double längd) {
        super(namn, längd, 0.5, matTyp.VATTEN);

    }

    // Polymorfism
    @Override
    public double beräknaVätskeIntag() {
        return getLängd() * getBasIntag();
    }
}



