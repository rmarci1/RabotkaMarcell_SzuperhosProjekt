package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String fajlEleresiUt) {
        try (BufferedReader br = new BufferedReader(new FileReader(fajlEleresiUt))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(" ");
                String nev = adatok[0];
                int kutyukSzama = Integer.parseInt(adatok[1]);

                Szuperhos szuperhos;
                if (nev.equals("Batman")) {
                    szuperhos = new Batman();
                } else if (nev.equals("Vasember")) {
                    szuperhos = new Vasember();
                } else {
                    continue;
                }

                for (int i = 0; i < kutyukSzama; i++) {
                    if (szuperhos instanceof Milliardos) {
                        ((Milliardos) szuperhos).kutyutKeszit();
                    }
                }

                szuperhosLista.add(szuperhos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void szuperhosok() {
        for (Szuperhos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }

    public static void main(String[] args) {
        szereplok("szuperhosok.txt");
        szuperhosok();
    }
}

