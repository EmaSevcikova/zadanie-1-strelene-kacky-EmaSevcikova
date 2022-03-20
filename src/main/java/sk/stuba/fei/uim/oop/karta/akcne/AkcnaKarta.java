package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.rybnik.HraciePole;

import java.util.List;

public abstract class AkcnaKarta {

    protected String nazovKarty;

    public abstract void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci);

    public String getNazovKarty() {
        return nazovKarty;
    }

    protected void vystrelNaKacku(int n, HraciePole rybnik, List<Karta> balicek, Hrac[] hraci){
        if (rybnik.getRybnik().get(n-1) instanceof Kacka){
            Karta kacka = rybnik.getRybnik().remove(n-1);
            rybnik.getRybnik().add(balicek.remove(0));
            hraci[kacka.getKohoKacka()-1].zastrelKacku();
        }
    }

}
