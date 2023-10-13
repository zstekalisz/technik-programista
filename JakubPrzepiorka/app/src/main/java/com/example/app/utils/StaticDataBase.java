package com.example.app.utils;

import com.example.app.R;
import com.example.app.model.Coffee;
import com.example.app.model.Drink;
import com.example.app.model.Snack;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> coffies = new ArrayList<>();
    static {
        coffies.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.espresso));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.cappucino));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                " dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
    }

    public static List<Snack> snacks = new ArrayList<>();
    static {
        snacks.add(new Snack(0, "Chipsy", "Chipsy to chrupiąca przekąska z cienko pokrojonych ziemniaków lub innych warzyw, smażonych lub pieczonych. " +
                "Są solone lub przyprawiane.", R.drawable.chips));
        snacks.add(new Snack(1, "Precle", "Precle to tradycyjna przekąska z kręconego ciasta drożdżowego, " +
                "z chrupiącą skórką na zewnątrz i miękkim wnętrzem.", R.drawable.pretzel));
        snacks.add(new Snack(2, "Orzeszki", "Orzeszki to małe przekąski w formie chrupkich, " +
                "solonych lub przyprawionych orzechów.", R.drawable.nuts));
    }

    public static List<Drink> drinks = new ArrayList<>();
    static {
        drinks.add(new Drink(0, "Coca-Cola", "Coca-Cola to popularny napój gazowany o charakterystycznym słodkim smaku, " +
                "który zawiera ekstrakt z liści koki i aromat z orzechów koli.", R.drawable.cola));
        drinks.add(new Drink(1, "Red Bull", "Red Bull to popularny napój energetyczny, który charakteryzuje się intensywnym smakiem, " +
                "wysoką zawartością kofeiny i witamin z grupy B.", R.drawable.redbull));
        drinks.add(new Drink(2, "Sok", "Sok to płyn pozyskiwany z owoców lub warzyw poprzez wyciśnięcie ich soku. " +
                "Charakteryzuje się bogactwem naturalnych składników odżywczych, " +
                "takich jak witaminy, minerały i antyoksydanty.", R.drawable.juice));
    }
}