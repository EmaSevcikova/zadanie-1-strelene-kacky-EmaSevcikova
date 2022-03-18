package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.rybnik.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.List;

public class Turbokacka extends AkcnaKarta{

    public Turbokacka() {
        super.nazovKarty = "Turbokačka";
    }

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci) {
        int n = KeyboardInput.readInt("Zadaj poziciu kačky, ktorú chceš posunúť ");
        while (n > 6 || n < 1){
            n = KeyboardInput.readInt("Rybník taký veľký nie je! Skús znovu");
        }
        Karta kacka = rybnik.getRybnik().remove(n-1);
        rybnik.getRybnik().add(0,kacka);

    }
    }
