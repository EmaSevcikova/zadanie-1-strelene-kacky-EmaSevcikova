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
        int n = KeyboardInput.readInt("Kam chceš zamieriť? ");
        while (n > 6 || n < 1){
            n = KeyboardInput.readInt("Snáď nechceš mieriť mimo rybníka?! ");
        }

        if (!rybnik.getZameriavace()[n - 1]) {
            rybnik.getZameriavace()[n - 1] = true;
        }
    }
}
