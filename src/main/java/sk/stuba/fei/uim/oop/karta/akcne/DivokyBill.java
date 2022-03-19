package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.rybnik.HraciePole;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.List;

public class DivokyBill extends AkcnaKarta{

    public DivokyBill(){
        super.nazovKarty = "Divoký Bill";
    }

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci){
        int cisloKarty = KeyboardInput.readInt("Namier a vystreľ! Ale kam? ");
        while (cisloKarty > 6 || cisloKarty < 1){
            cisloKarty = KeyboardInput.readInt("Strieľaš mimo rybníka! Skús znovu");
        }
        this.vystrelNaKacku(cisloKarty,rybnik,balicek,hraci);

        if (rybnik.getZameriavace()[cisloKarty-1]){
            rybnik.getZameriavace()[cisloKarty-1] = false;
        }
    }
}
