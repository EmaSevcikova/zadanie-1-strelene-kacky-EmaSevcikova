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

    public void streleneKacky(){
        System.out.println("__________Vitaj v hre strelené kačky!__________\n");
        zacniHru();
        System.out.println("__________Koniec hry.__________");
    }


    public void zacniHru(){
        pripravHru();
        while (vitaz()){
        for (int i = 0; i < hraci.length; i++) {
            if (hraci[i].jeAktivny()) {
                System.out.println("\n");
                System.out.println(rybnik.vypisHraciePole());

                System.out.println(" \n--------");
                System.out.println("Karty hráča " + hraci[i].getCisloHraca());
                System.out.println(hraci[i].vypisKartyNaRuke());
                System.out.println("--------");

                while (!daSaNejakaKartaZahrat(hraci[i])) {
                    System.out.println("Z tvojích kariet sa nedá žiadna zahrať. Ťaháš si novú.");
                    hraci[i].vratKartu(akcneKarty);
                    hraci[i].tahajKartu(akcneKarty);
                    System.out.println(" \n--------");
                    System.out.println("Karty hráča " + hraci[i].getCisloHraca());
                    System.out.println(hraci[i].vypisKartyNaRuke());
                    System.out.println("--------");
                }

                int cisloKarty = KeyboardInput.readInt("Si na ťahu! Vyber kartu, ktorú chceš zahrať ");
                while (1 > cisloKarty || cisloKarty > 3) {
                    cisloKarty = KeyboardInput.readInt("Toľko kariet nemáš... Vyberáš znovu ");
                }

                while (!daSaKartaZahrat(hraci[i].getKartyNaRuke().get(cisloKarty-1))){
                    cisloKarty = KeyboardInput.readInt("Túto kartu nemôžeš zahrať. Vyber si inú. ");
                }

                AkcnaKarta karta = hraci[i].getKartyNaRuke().remove(cisloKarty - 1);
                karta.akciaKarty(rybnik, balicekKackyVoda, hraci);
                akcneKarty.add(karta);

                hraci[i].tahajKartu(akcneKarty);

                System.out.println("\nPočet kačiek hráčov:");
                for (int j = 0; j < hraci.length; j++) {
                    System.out.print("Hráč " + (j + 1) + ". " + hraci[j].getPocetKaciek() + "| ");
                }
            }
        if (!vitaz())
            break;
        }
        }
        for (Hrac hrac : this.hraci){
            if (hrac.jeAktivny()){
                System.out.println("\nVyhral hráč č." + hrac.getCisloHraca());
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


        int pocetHracov = KeyboardInput.readInt("Zvol si počet hráčov ");
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

        public boolean daSaNejakaKartaZahrat(Hrac hrac){
        int kontrola = 0;
        for (AkcnaKarta karta : hrac.getKartyNaRuke()){
            if (daSaKartaZahrat(karta)){
                kontrola += 1;
            }
        }
        return kontrola > 0;
        }

        public boolean daSaKartaZahrat(AkcnaKarta karta){
        int kontrola = 0;

        if (karta instanceof Vystrelit){
            for (boolean zamierene : rybnik.getZameriavace()){
                if (zamierene){
                    kontrola += 1;
                }
            }
            return kontrola > 0;
        }
        if (karta instanceof Zamierit){
            for (boolean zamierene : rybnik.getZameriavace()){
                if (!zamierene){
                    kontrola += 1;
                }
            }
            return kontrola > 0;
        }
        else{
            return true;
        }

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

