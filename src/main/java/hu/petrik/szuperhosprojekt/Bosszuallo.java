package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public float mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos ellenfel) {
        if (ellenfel instanceof Bosszuallo) {
            Bosszuallo bosszualloEllenfel = (Bosszuallo) ellenfel;
            if (bosszualloEllenfel.vanEGyengesege && bosszualloEllenfel.szuperero < this.szuperero) {
                return true;
            }
        }
        return false;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        String gyengeseg = vanEGyengesege ? "van gyengesege" : "nincs gyengesege";
        return MessageFormat.format("Szuperero: {0,number,#.##}; {1}", szuperero, gyengeseg);
    }
}

