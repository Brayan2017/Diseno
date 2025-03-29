package com.company.simple;

import com.company.Builder;

public abstract class AbstracBurgerBuilder implements Builder<Burger> {

    public abstract AbstracBurgerBuilder withLettuce();
    public abstract AbstracBurgerBuilder withBeef();
    public abstract AbstracBurgerBuilder withPork();
    public abstract AbstracBurgerBuilder withChicken();
    public abstract AbstracBurgerBuilder addtomate(int amount);
    public abstract AbstracBurgerBuilder addOnio(int amount);
    public abstract AbstracBurgerBuilder addSlicesOfCheese(int amount);
}
