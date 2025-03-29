package com.company.simple;

public class BurgerBuilder extends AbstracBurgerBuilder{

    private Burger burger;

    private BurgerBuilder() {
        this.burger = new Burger();
    }

    public static BurgerBuilder burger(){
        return new BurgerBuilder();
    }

    @Override
    public Burger build() {
        return burger;
    }

    @Override
    public AbstracBurgerBuilder withLettuce() {
        this.burger.setHasLettuce(true);
        return this;
    }

    @Override
    public AbstracBurgerBuilder withBeef() {
        this.burger.setHasBeef(true);
        return this;
    }

    @Override
    public AbstracBurgerBuilder withPork() {
        this.burger.setHasPork(true);
        return this;
    }

    @Override
    public AbstracBurgerBuilder withChicken() {
        this.burger.setHasChicken(true);
        return this;
    }

    @Override
    public AbstracBurgerBuilder addtomate(int amount) {
        this.burger.setAmountTomato(amount);
        return this;
    }

    @Override
    public AbstracBurgerBuilder addOnio(int amount) {
        this.burger.setAmountOnion(amount);
        return this;
    }

    @Override
    public AbstracBurgerBuilder addSlicesOfCheese(int amount) {
        this.burger.setAmountslicesOfCheese(amount);
        return this;
    }
}
