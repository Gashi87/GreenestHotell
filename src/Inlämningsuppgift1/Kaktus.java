package Inlämningsuppgift1;

public class Kaktus extends Växt{
    // CL
    private double basnivå = 2;

    private String föda = "mineralvatten";

    public Kaktus(String namn,double längd) {
        super(namn, längd);
    }
    public String hurMycket() {
        return namn + " Behöver 2 cl per dag.";

    }
}
