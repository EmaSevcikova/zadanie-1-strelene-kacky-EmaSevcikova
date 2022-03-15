package sk.stuba.fei.uim.oop.karta;

import sk.stuba.fei.uim.oop.karta.akcne.AkcnaKarta;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class BalicekAkcnychKariet {

    private final LinkedList<AkcnaKarta> balicekAkcnychKariet;

    public BalicekAkcnychKariet(List<AkcnaKarta> karty){
        balicekAkcnychKariet = new LinkedList<>(karty);
    }

    public LinkedList<AkcnaKarta> getBalicekAkcnychKariet() {
        return balicekAkcnychKariet;
    }

    public void zamiesajKarty(){
        Collections.shuffle(this.balicekAkcnychKariet);
    }

}
