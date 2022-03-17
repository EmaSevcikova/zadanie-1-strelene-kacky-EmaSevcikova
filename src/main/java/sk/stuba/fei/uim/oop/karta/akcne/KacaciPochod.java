package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karta.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;

import java.util.List;

public class KacaciPochod extends AkcnaKarta{

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci){

        Karta karta = rybnik.getRybnik().remove(0);
        balicek.add(karta);
        rybnik.getRybnik().add(balicek.remove(0));

    }
}
