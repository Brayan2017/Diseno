package com.company.simple;

public class Burger {
    private static final int AMOUNT_BREADS = 2;
    private boolean hasLettuce;
    private boolean hasBeef;
    private boolean hasPork;
    private boolean hasChicken;
    private int amountTomato;
    private int amountOnion;
    private int amountslicesOfCheese;

    public boolean isHasLettuce() {
        return hasLettuce;
    }

    public void setHasLettuce(boolean hasLettuce) {
        this.hasLettuce = hasLettuce;
    }

    public boolean isHasBeef() {
        return hasBeef;
    }

    public void setHasBeef(boolean hasBeef) {
        this.hasBeef = hasBeef;
    }

    public boolean isHasPork() {
        return hasPork;
    }

    public void setHasPork(boolean hasPork) {
        this.hasPork = hasPork;
    }

    public boolean isHasChicken() {
        return hasChicken;
    }

    public void setHasChicken(boolean hasChicken) {
        this.hasChicken = hasChicken;
    }

    public int getAmountTomato() {
        return amountTomato;
    }

    public void setAmountTomato(int amountTomato) {
        this.amountTomato = amountTomato;
    }

    public int getAmountOnion() {
        return amountOnion;
    }

    public void setAmountOnion(int amountOnion) {
        this.amountOnion = amountOnion;
    }

    public int getAmountslicesOfCheese() {
        return amountslicesOfCheese;
    }

    public void setAmountslicesOfCheese(int amountslicesOfCheese) {
        this.amountslicesOfCheese = amountslicesOfCheese;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "hasLettuce=" + hasLettuce +
                ", hasBeef=" + hasBeef +
                ", hasPork=" + hasPork +
                ", hasChicken=" + hasChicken +
                ", amountTomato=" + amountTomato +
                ", amountOnion=" + amountOnion +
                ", amountslicesOfCheese=" + amountslicesOfCheese +
                '}';
    }
}
