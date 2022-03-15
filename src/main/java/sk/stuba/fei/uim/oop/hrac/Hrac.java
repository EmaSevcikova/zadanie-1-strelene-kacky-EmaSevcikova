package sk.stuba.fei.uim.oop.hrac;

import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.karta.akcne.AkcnaKarta;

import java.util.ArrayList;
import java.util.LinkedList;

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

    public void tahajKartu(BalicekAkcnychKariet balicek){
        this.kartyNaRuke.add(balicek.getBalicekAkcnychKariet().pop());
    }

    public void dostaneKarty(BalicekAkcnychKariet balicek){
        this.kartyNaRuke.add(balicek.getBalicekAkcnychKariet().pop());
        this.kartyNaRuke.add(balicek.getBalicekAkcnychKariet().pop());
        this.kartyNaRuke.add(balicek.getBalicekAkcnychKariet().pop());
    }

    public void vratKartu(BalicekAkcnychKariet balicek, int n){
        balicek.getBalicekAkcnychKariet().addLast(this.kartyNaRuke.remove(n+1));
    }

    public AkcnaKarta zahrajKartu(int n){
        return this.kartyNaRuke.remove(n);
    }

}
