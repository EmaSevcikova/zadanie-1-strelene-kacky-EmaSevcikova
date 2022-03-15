package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karta.BalicekKackyVoda;
import sk.stuba.fei.uim.oop.karta.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;

import java.util.ArrayList;
import java.util.Collections;

public class Rosambo extends AkcnaKarta{

    @Override
    public void akciaKarty(HraciePole rybnik, BalicekKackyVoda balicek, Hrac[] hraci) {
        Collections.shuffle(rybnik.getRybnik());
    }
    }
