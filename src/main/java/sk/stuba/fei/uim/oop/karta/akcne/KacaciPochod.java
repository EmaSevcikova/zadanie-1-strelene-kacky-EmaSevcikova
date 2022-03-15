package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karta.BalicekKackyVoda;
import sk.stuba.fei.uim.oop.karta.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;

import java.util.ArrayList;
import java.util.LinkedList;

public class KacaciPochod extends AkcnaKarta{

    @Override
    public void akciaKarty(HraciePole rybnik, BalicekKackyVoda balicek, Hrac[] hraci){

        Karta karta = rybnik.getRybnik().remove(0);
        balicek.getBalicekKackyVoda().add(karta);
        rybnik.getRybnik().add(balicek.getBalicekKackyVoda().remove());

    }
}
