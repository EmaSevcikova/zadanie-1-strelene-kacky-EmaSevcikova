package sk.stuba.fei.uim.oop.hrac;

public class Hrac {
    private boolean aktivny = true;
    private int cisloHraca;
    private int pocetKaciek = 5;


    public Hrac(int cislo){
        this.cisloHraca = cislo;
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
