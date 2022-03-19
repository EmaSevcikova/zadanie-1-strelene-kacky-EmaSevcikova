package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.rybnik.HraciePole;
import sk.stuba.fei.uim.oop.karta.Karta;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.List;

public class Zamierit extends AkcnaKarta{

    public Zamierit() {
        super.nazovKarty = "Zamieriť";
    }

    @Override
    public void akciaKarty(HraciePole rybnik, List<Karta> balicek, Hrac[] hraci){
        int cisloKarty = KeyboardInput.readInt("Kam chceš zamieriť? ");

        while (cisloKarty > 6 || cisloKarty < 1){
            cisloKarty = KeyboardInput.readInt("Snáď nechceš mieriť mimo rybníka?! ");
        }

        while(rybnik.getZameriavace()[cisloKarty - 1]) {
            cisloKarty = KeyboardInput.readInt("Toto políčko už je zamierené. Vyber iné ");
        }

        rybnik.getZameriavace()[cisloKarty - 1] = true;
    }
}
