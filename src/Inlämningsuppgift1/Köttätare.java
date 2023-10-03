package Inlämningsuppgift1;

public class Köttätare extends Växt{
     // Liter
    private double basnivå = 0.1;

    private double andel = 0.2;

    private String föda = "proteindryck";

    public Köttätare(String namn, double längd) {
        super(namn, längd);
    }
    public String hurMycket() {
        double mängdNäring = basnivå + (andel * längd);
        return namn + " behöver " + Double.toString(mängdNäring) + föda + " per dag";

    }
}
