package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karta.BalicekKackyVoda;
import sk.stuba.fei.uim.oop.karta.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;

import java.util.ArrayList;

public class KacaciTanec extends AkcnaKarta{

    @Override
    public void akciaKarty(HraciePole rybnik, BalicekKackyVoda balicek, Hrac[] hraci) {
        balicek.getBalicekKackyVoda().addAll(rybnik.getRybnik());
        balicek.zamiesajKarty();
        for (int i = 0; i < 6; i++) {
            rybnik.getRybnik().add(balicek.getBalicekKackyVoda().pop());
        }
    }
    }
