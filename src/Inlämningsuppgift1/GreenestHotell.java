package Inlämningsuppgift1;

import java.util.Scanner;

public class GreenestHotell {
    public static void main(String[] args) {



       Växt palm1 = new Palm("Olof", 1);
       Växt kaktus1 = new Kaktus("Igge",20);
       Växt köttätare = new Köttätare("Meatlof",0.7);
       Växt palm2 = new Palm("Laura",5);

        System.out.println(palm1.hurMycket());

    }
}
