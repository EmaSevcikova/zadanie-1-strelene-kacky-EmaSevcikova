package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karta.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;

import java.util.Collections;
import java.util.List;

public class Rosambo extends AkcnaKarta{

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci) {
        Collections.shuffle(rybnik.getRybnik());
    }
    }
