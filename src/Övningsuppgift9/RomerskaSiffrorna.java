package Övningsuppgift9;

public enum RomerskaSiffrorna {
    I(1,"Ett"), V(5,"Fem"), X(10, "Tio"), L(50,"Femtio"), C(100,"Ett hundra"), D(500,"Fem hundra"), M(1000
    ,"Ett tusen");

    public int numericVal;
    public String stringVal;

    private RomerskaSiffrorna(int i, String s) {
        numericVal = i;
        stringVal = s;
    }
}

