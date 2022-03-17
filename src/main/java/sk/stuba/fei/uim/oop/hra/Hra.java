package sk.stuba.fei.uim.oop.hra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.karta.akcne.*;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

public class Hra {

    private Hrac[] hraci;
    private HraciePole rybnik;

    public void zacniHru(){

    }

    public void pripravHru(){
        List<AkcnaKarta> akcneKarty = new ArrayList<>(List.of(new DivokyBill(),
                new DivokyBill(), new Turbokacka(), new Rosambo(), new Rosambo(), new KacaciTanec()));
        for (int i = 0; i < 10; i++){
            akcneKarty.add(new Zamierit());
        }
        for (int i = 0; i < 12; i++){
            akcneKarty.add(new Vystrelit());
        }
        for (int i = 0; i < 6; i++){
            akcneKarty.add(new KacaciPochod());
        }

        Collections.shuffle(akcneKarty);

        List<Karta> kackyVoda = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            kackyVoda.add(new Voda());
        }


        int pocetHracov = KeyboardInput.readInt("Zvol si pocet hracov: ");
        hraci = new Hrac[pocetHracov];

        for (int i = 0; i < pocetHracov; i++){
            hraci[i] = new Hrac(i+1);
            hraci[i].dostaneKarty(akcneKarty);
            for (int j = 0; j < 5; j++){
                kackyVoda.add(new Kacka(hraci[i]));
            }
        }

        Collections.shuffle(kackyVoda);

         this.rybnik = new HraciePole(kackyVoda);

        }

    }

