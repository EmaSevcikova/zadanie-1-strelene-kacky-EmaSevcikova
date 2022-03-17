package sk.stuba.fei.uim.oop.hrac;

import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.karta.akcne.AkcnaKarta;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hrac {
    private boolean aktivny;
    private int cisloHraca;
    private int pocetKaciek;
    private ArrayList<AkcnaKarta> kartyNaRuke;


    public Hrac(int cislo) {
        this.cisloHraca = cislo;
        this.pocetKaciek = 5;
        this.aktivny = true;
        this.kartyNaRuke = new ArrayList<>();
    }



    public int getCisloHraca() {

        return cisloHraca;
    }

    public int getPocetKaciek() {

        return pocetKaciek;
    }

    public void zastrelKacku() {
        this.pocetKaciek = this.pocetKaciek - 1;
    }

    public void jeAktivny() {
        if(getPocetKaciek() <= 0){
            this.aktivny = false;
        }
    }

    public void tahajKartu(List<AkcnaKarta> balicek){
        this.kartyNaRuke.add(balicek.remove(0));
    }

    public void dostaneKarty(List<AkcnaKarta> balicek){
        this.kartyNaRuke.add(balicek.remove(0));
        this.kartyNaRuke.add(balicek.remove(0));
        this.kartyNaRuke.add(balicek.remove(0));
    }

    public void vratKartu(List<AkcnaKarta> balicek){
        int n = KeyboardInput.readInt("Ktoru kartu chces vratit? ");
        balicek.add(this.kartyNaRuke.remove(n-1));
    }

    public AkcnaKarta zahrajKartu(){
        int n = KeyboardInput.readInt("Vyber kartu: ");
        return this.kartyNaRuke.remove(n-1);
    }

}
