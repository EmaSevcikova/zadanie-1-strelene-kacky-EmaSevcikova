package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.rybnik.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.List;

public class Vystrelit extends AkcnaKarta{

    public Vystrelit() {
        super.nazovKarty = "Vystreliť";
    }

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci){
        int cisloKarty = KeyboardInput.readInt("Ktorú kačku chceš zastreliť? ");
        while (cisloKarty > 6 || cisloKarty < 1){
            cisloKarty = KeyboardInput.readInt("Strieľaš mimo rybníka! Skús znovu");
        }

        while (!rybnik.getZameriavace()[cisloKarty-1]){
            cisloKarty = KeyboardInput.readInt("Toto políčko nie je zamierené. Vyber iné ");
        }

        this.vystrelNaKacku(cisloKarty,rybnik,balicek,hraci);
        rybnik.getZameriavace()[cisloKarty-1] = false;

    }


}

