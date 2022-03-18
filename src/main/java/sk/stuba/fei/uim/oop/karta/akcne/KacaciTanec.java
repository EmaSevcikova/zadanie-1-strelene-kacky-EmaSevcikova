package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.rybnik.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;

import java.util.Collections;
import java.util.List;

public class KacaciTanec extends AkcnaKarta{

    public KacaciTanec() {
        super.nazovKarty = "Kačací Tanec";
    }

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci) {
        balicek.addAll(rybnik.getRybnik());
        Collections.shuffle(balicek);
        for (int i = 0; i < 6; i++) {
            rybnik.getRybnik().add(balicek.remove(0));
        }
        }
    }
