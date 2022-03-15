package sk.stuba.fei.uim.oop.karta.akcne;

import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karta.BalicekKackyVoda;
import sk.stuba.fei.uim.oop.karta.Karta;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.ArrayList;
import java.util.LinkedList;

public class Zamierit extends AkcnaKarta{

    @Override
    public void akciaKarty(boolean[] zameriavace, ArrayList<Karta> rybnik, BalicekKackyVoda balicek, Hrac[] hraci){
        int n = KeyboardInput.readInt("Zadaj poziciu karty: ");

        if (!zameriavace[n + 1]) {
            zameriavace[n + 1] = true;
        }
    }
}
