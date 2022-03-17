package sk.stuba.fei.uim.oop.karta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HraciePole {

    private ArrayList<Karta> rybnik;
    private boolean[] zameriavace;

    public HraciePole(List<Karta> karty){
        this.rybnik = new ArrayList<>();
        for (int i = 0; i<6; i++) {
            this.rybnik.add(karty.remove(0));
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
