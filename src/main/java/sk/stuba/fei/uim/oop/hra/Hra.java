package sk.stuba.fei.uim.oop.hra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sk.stuba.fei.uim.oop.karta.*;
import sk.stuba.fei.uim.oop.karta.akcne.*;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.rybnik.HraciePole;
import sk.stuba.fei.uim.oop.utility.KeyboardInput;

public class Hra {

    private Hrac[] hraci;
    private HraciePole rybnik;
    List<Karta> balicekKackyVoda;
    List<AkcnaKarta> akcneKarty;


    public void zacniHru(){
        pripravHru();
        while (vitaz()){
        for (int i = 0; i < hraci.length; i++) {
            System.out.println(rybnik.vypisHraciePole());
            System.out.println("--------");
            System.out.println("Karty hráča " + hraci[i].getCisloHraca());
            System.out.println(hraci[i].vypisKartyNaRuke());
            System.out.println("--------");

            int cisloKarty = KeyboardInput.readInt("Si na ťahu! Vyber kartu, ktorú chceš zahrať ");
            while (1 > cisloKarty ||  cisloKarty > 3 ){
                cisloKarty = KeyboardInput.readInt("Toľko kariet nemáš... Vyberáš znovu ");
            }
            hraci[i].getKartyNaRuke().remove(cisloKarty - 1).akciaKarty(rybnik, balicekKackyVoda, hraci);
            hraci[i].tahajKartu(akcneKarty);
        }
        }


    }

    public void pripravHru(){
        this.akcneKarty = new ArrayList<>(List.of(new DivokyBill(),
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

        this.balicekKackyVoda = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            balicekKackyVoda.add(new Voda());
        }


        int pocetHracov = KeyboardInput.readInt("Zvol si pocet hracov ");
        while (2 > pocetHracov ||  pocetHracov > 6 ){
            pocetHracov = KeyboardInput.readInt("Hráčov môže byť minimálne 2 a maximálne 6 ");
        }
        hraci = new Hrac[pocetHracov];

        for (int i = 0; i < pocetHracov; i++){
            hraci[i] = new Hrac(i+1);
            hraci[i].dostaneKarty(akcneKarty);
            for (int j = 0; j < 5; j++){
                balicekKackyVoda.add(new Kacka(hraci[i]));
            }
        }

        Collections.shuffle(balicekKackyVoda);

         this.rybnik = new HraciePole(balicekKackyVoda);

        }

        public boolean vitaz(){
        int pocetAktivnychHracov = 0;
        for (Hrac hrac : this.hraci){
            if (hrac.jeAktivny()){
                pocetAktivnychHracov += 1;
            }
        }
            return pocetAktivnychHracov > 1;
        }

    }

