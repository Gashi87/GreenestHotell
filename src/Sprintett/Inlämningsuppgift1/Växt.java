package Sprintett.Inlämningsuppgift1;

import Sprintett.Inlämningsuppgift1.Övninguppgift1A.matTyp;
// skapar en abstract klass som en mall för alla plantor
abstract public class Växt implements VäxtInterface {
    private String namn;
    private double längd;

    private double basIntag;
    private matTyp mattyp;
    public Växt(String namn, double längd, double basIntag, matTyp mattyp) {
        this.namn = namn;
        this.längd = längd;
        this.basIntag = basIntag;
        this.mattyp = mattyp;
    }
    public String vätskeInstruktioner() {
        return getNamn() + " behöver " + beräknaVätskeIntag() + " L" +
                " av typen " + getMattyp();

    }
    //Polymorfism
    abstract public double beräknaVätskeIntag();


    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }

    public double getBasIntag() {
        return basIntag;
    }

    public void setBasIntag(double basIntag) {
        this.basIntag = basIntag;
    }

    public matTyp getMattyp() {
        return mattyp;
    }

    public void setMattyp(matTyp mattyp) {
        this.mattyp = mattyp;
    }
}
