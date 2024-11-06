package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {

    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        Random rand = new Random();
        float novekedes = rand.nextFloat() * 10;
        setSzuperero(getSzuperero() + novekedes);
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}

