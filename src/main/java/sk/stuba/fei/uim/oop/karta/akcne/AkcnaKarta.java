package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import java.util.ArrayList;

public abstract class AkcnaKarta {

    public abstract void akciaKarty( HraciePole rybnik, BalicekKackyVoda balicek, Hrac[] hraci);

    public void vystrelNaKacku(int n,HraciePole rybnik, BalicekKackyVoda balicek, Hrac[] hraci){
        if (rybnik.getRybnik().get(n+1) instanceof Kacka){
            rybnik.getRybnik().remove(n+1);
            rybnik.getRybnik().add(balicek.getBalicekKackyVoda().getFirst());
            Karta kacka = rybnik.getRybnik().get(n+1);
            hraci[kacka.getKohoKacka()].zastrelKacku();
        }
    }

}
