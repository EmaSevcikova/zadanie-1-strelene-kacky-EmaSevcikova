package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.rybnik.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;

import java.util.Collections;
import java.util.List;

public class Rosambo extends AkcnaKarta{

    public Rosambo() {
        super.nazovKarty = "Rošambo";
    }

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci) {
        Collections.shuffle(rybnik.getRybnik());
        System.out.println("!Rošambo v rybníku!\n");
        }
    }
