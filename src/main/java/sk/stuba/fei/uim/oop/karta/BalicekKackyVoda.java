package sk.stuba.fei.uim.oop.karta;

import sk.stuba.fei.uim.oop.karta.Karta;
import sk.stuba.fei.uim.oop.karta.akcne.AkcnaKarta;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class BalicekKackyVoda {
    private final LinkedList<Karta> balicekKackyVoda;

    public BalicekKackyVoda(List<Karta> karty){
        balicekKackyVoda = new LinkedList<>(karty);
    }

    public LinkedList<Karta> getBalicekKackyVoda() {
        return balicekKackyVoda;
    }

    public void zamiesajKarty(){
        Collections.shuffle(this.balicekKackyVoda);
    }
}
