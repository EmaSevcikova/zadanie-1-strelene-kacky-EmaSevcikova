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
        int n = KeyboardInput.readInt("Namier a vystreľ! Ale kam? ");
        while (n > 6 || n < 1){
            n = KeyboardInput.readInt("Strieľaš mimo rybníka! Skús znovu");
        }
        this.vystrelNaKacku(n,rybnik,balicek,hraci);

        if (rybnik.getZameriavace()[n-1]){
            rybnik.getZameriavace()[n-1] = false;
        }
    }
}
