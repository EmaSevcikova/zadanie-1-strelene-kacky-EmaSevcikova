package sk.stuba.fei.uim.oop.hrac;

public class Hrac {
    private boolean aktivny;
    private int cisloHraca;
    private int pocetKaciek;


    public void setCisloHraca(int cisloHraca) {
        this.cisloHraca = cisloHraca;
    }

    public int getCisloHraca() {
        return cisloHraca;
    }

    public void setPocetKaciek(int pocetKaciek) {
        this.pocetKaciek = pocetKaciek;
    }

    public int getPocetKaciek() {
        return pocetKaciek;
    }
    public boolean jeAktivny(){
        return getPocetKaciek() > 0;
    }
}
