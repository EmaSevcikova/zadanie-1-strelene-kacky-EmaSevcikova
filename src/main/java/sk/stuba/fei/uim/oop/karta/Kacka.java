package sk.stuba.fei.uim.oop.karta;

import sk.stuba.fei.uim.oop.hrac.Hrac;

public class Kacka extends Karta{

    private int kohoKacka;

    @Override
    public void aktivnyHrac(Hrac hrac){
        this.kohoKacka = hrac.getCisloHraca();
    }

}
