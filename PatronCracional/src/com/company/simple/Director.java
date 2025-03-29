package com.company.simple;

import static com.company.simple.BurgerBuilder.burger;

public class Director {

    public static void main(String[] args) {

        burgerByDefault();
        burgerExample();
    }

    private static void burgerExample() {
        Burger burgerExample = burger()
                .withPork()
                .withChicken()
                .addtomate(2)
                .addSlicesOfCheese(2)
                .addOnio(1)
                .build();
        showBurger("burger BrayanSpecial", burgerExample);
    }


    private static void burgerByDefault() {
        Burger burgerDefault = burger().build();
        showBurger("burger by default", burgerDefault);
    }

    private static void showBurger(String message, Burger burger) {
        System.out.println("\n" + message + "\n" + burger.toString());
    }
}
