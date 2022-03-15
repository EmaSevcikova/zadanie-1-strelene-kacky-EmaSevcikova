package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import java.util.ArrayList;

public abstract class AkcnaKarta {

    public abstract void akciaKarty(boolean[] zameriavace, ArrayList<Karta> rybnik, BalicekKackyVoda balicek, Hrac[] hraci);

    public void vystrelNaKacku(int n,ArrayList<Karta> rybnik, BalicekKackyVoda balicek, Hrac[] hraci){
        if (rybnik.get(n+1) instanceof Kacka){
            rybnik.remove(n+1);
            rybnik.add(balicek.getBalicekKackyVoda().getFirst());
            Karta kacka = rybnik.get(n+1);
            hraci[kacka.getKohoKacka()].zastrelKacku();
        }
    }

}
