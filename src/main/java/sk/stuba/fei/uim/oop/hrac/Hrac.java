package sk.stuba.fei.uim.oop.hrac;

import sk.stuba.fei.uim.oop.karta.Karta;
import java.util.List;

public class Hrac {
    private boolean aktivny = true;
    private int cisloHraca;
    private int pocetKaciek = 5;
    private List<Karta> kartyNaRuke;


    public Hrac(int cislo){
        this.cisloHraca = cislo;
    }


    public int getCisloHraca() {
        return cisloHraca;
    }

    public int getPocetKaciek() {
        return pocetKaciek;
    }
    public void jeAktivny() {
        if(getPocetKaciek() <= 0){
            this.aktivny = false;
        }
    }
}
