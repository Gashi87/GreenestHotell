package Inlämningsuppgift1;

import javax.swing.*;

public class Palm extends Växt{

    String mängdNäring = JOptionPane.showInputDialog("Vem ska ha vätska?");
    // Liter
    private double andel = 0.5;

    private String föda = "kranvatten";

    public Palm(String namn, double längd) {
        super(namn, längd);

    }
    public String hurMycket() {
       double mängdNäring = 0.5 * längd;
        return namn + " behöver " + Double.toString(mängdNäring) + " liter " + föda + " per dag";

    }


}
