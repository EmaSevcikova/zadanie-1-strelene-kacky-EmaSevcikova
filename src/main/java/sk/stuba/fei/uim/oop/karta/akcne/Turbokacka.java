package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.rybnik.HraciePole;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.List;

public class Turbokacka extends AkcnaKarta{

    public Turbokacka() {
        super.nazovKarty = "Turbokačka";
    }

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci) {
        int cisloKarty = KeyboardInput.readInt("Zadaj poziciu kačky, ktorú chceš posunúť ");
        while (cisloKarty > 6 || cisloKarty < 1){
            cisloKarty = KeyboardInput.readInt("Rybník taký veľký nie je! Skús znovu");
        }

        while (rybnik.getRybnik().get(cisloKarty-1) instanceof Voda){
            cisloKarty = KeyboardInput.readInt("Vyber kačku, nie vodu... ");
        }

        Karta karta = rybnik.getRybnik().remove(cisloKarty-1);
        rybnik.getRybnik().add(0,karta);

    }
    }
