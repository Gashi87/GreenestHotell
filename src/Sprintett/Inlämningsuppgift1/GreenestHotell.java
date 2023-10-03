package Sprintett.Inlämningsuppgift1;

import javax.swing.*;
import java.util.List;

public class GreenestHotell {
    public static void main(String[] args) {

    // Här skapar jag en lista med Växter

        List<Växt> minVäxt = List.of(
                new Palm("Laura", 5),
                new Palm("Putte", 1),
                new Kaktus("Igge", 0.2),
                new Köttätare("Meatloaf", 0.7));

        String valdPlanta =(String) JOptionPane.showInputDialog(null,"Välj vilken växt du vill mata ",
                "Välj växt ",
                JOptionPane.QUESTION_MESSAGE,null,minVäxt.stream().map(växt -> växt.getNamn()).toArray(),
                minVäxt.get(0).getNamn());

        Växt selectedPlant = minVäxt.stream()
                .filter(växt -> växt.getNamn().equals(valdPlanta))
                .findFirst()
                .orElseThrow();

        JOptionPane.showMessageDialog(null, selectedPlant.vätskeInstruktioner());
    }

}

