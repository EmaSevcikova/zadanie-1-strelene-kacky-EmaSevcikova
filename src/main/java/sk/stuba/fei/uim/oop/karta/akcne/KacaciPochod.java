package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karta.BalicekKackyVoda;
import sk.stuba.fei.uim.oop.karta.Karta;

import java.util.ArrayList;
import java.util.LinkedList;

public class KacaciPochod extends AkcnaKarta{

    @Override
    public void akciaKarty(boolean[] zameriavace, ArrayList<Karta> rybnik, BalicekKackyVoda balicek, Hrac[] hraci){

        Karta karta = rybnik.remove(0);
        balicek.getBalicekKackyVoda().add(karta);
        rybnik.add(balicek.getBalicekKackyVoda().remove());

    }
}
