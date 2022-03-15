package sk.stuba.fei.uim.oop.karta;

import sk.stuba.fei.uim.oop.hrac.Hrac;

public class Kacka extends Karta{

    public Kacka(Hrac hrac){
        super.kohoKacka = hrac.getCisloHraca();
    }
}
