package sk.stuba.fei.uim.oop.rybnik;

import sk.stuba.fei.uim.oop.hra.Hra;
import sk.stuba.fei.uim.oop.karta.Kacka;
import sk.stuba.fei.uim.oop.karta.Karta;
import sk.stuba.fei.uim.oop.karta.akcne.AkcnaKarta;
import sk.stuba.fei.uim.oop.karta.akcne.Turbokacka;
import sk.stuba.fei.uim.oop.karta.akcne.Vystrelit;
import sk.stuba.fei.uim.oop.karta.akcne.Zamierit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


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

    private String vypisZameriavac(int index){
        if (this.zameriavace[index]){
            return "Zamierené";
        }
        else {
            return "Nezamierené";
        }
    }

    public String vypisHraciePole(){
        StringBuilder vypis = new StringBuilder();
        int index = 0;
        for (Karta karta : rybnik){
            if (karta instanceof Kacka){
                vypis.append(rybnik.indexOf(karta)+1);
                vypis.append(". ");
                vypis.append(vypisZameriavac(index));
                vypis.append(" - ");
                vypis.append("Kačka hráča ");
                vypis.append(karta.getKohoKacka());
                vypis.append("\n");
            }
            else{
                vypis.append(this.rybnik.indexOf(karta)+1);
                vypis.append(". ");
                vypis.append(vypisZameriavac(index));
                vypis.append(" - ");
                vypis.append("Voda");
                vypis.append("\n");
            }
            index++;
        }
        return vypis.toString();
    }


}
