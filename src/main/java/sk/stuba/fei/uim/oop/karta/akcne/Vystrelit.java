package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.karta.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.List;

public class Vystrelit extends AkcnaKarta{

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci){
        int n = KeyboardInput.readInt("Zadaj poziciu karty: ");

        if (rybnik.getZameriavace()[n-1]){
            this.vystrelNaKacku(n,rybnik,balicek,hraci);
            rybnik.getZameriavace()[n-1] = false;
        }
    }


}

