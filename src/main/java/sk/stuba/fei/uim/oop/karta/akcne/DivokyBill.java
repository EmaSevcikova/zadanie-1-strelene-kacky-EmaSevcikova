package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.karta.Kacka;
import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DivokyBill extends AkcnaKarta{

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci){
        int n = KeyboardInput.readInt("Zadaj poziciu karty: ");

        this.vystrelNaKacku(n,rybnik,balicek,hraci);

        if (rybnik.getZameriavace()[n-1]){
            rybnik.getZameriavace()[n-1] = false;
        }
    }
}
