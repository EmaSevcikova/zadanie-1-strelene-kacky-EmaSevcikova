package sk.stuba.fei.uim.oop.karta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sk.stuba.fei.uim.oop.karta.BalicekKackyVoda;

public class HraciePole {

    private ArrayList<Karta> rybnik;
    private boolean[] zameriavace;

    public HraciePole(BalicekKackyVoda karty){
        this.rybnik = new ArrayList<>();
        for (int i = 0; i<6; i++) {
            this.rybnik.add(karty.getBalicekKackyVoda().pop());
        }
        this.zameriavace = new boolean[6];
        Arrays.fill(zameriavace,false);
    }

    public ArrayList<Karta> getRybnik() {
        return rybnik;
    }

    public boolean[] getZameriavace() {
        return zameriavace;
    }
}
