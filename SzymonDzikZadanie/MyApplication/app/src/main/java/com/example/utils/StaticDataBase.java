package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> Kawy = new ArrayList<>();
    public static List<Coffee> Herbaty = new ArrayList<>();
    public static List<Coffee> Lody = new ArrayList<>();
    static {
        Kawy.add(new Coffee(0, "Kawa Czarna", "Zwykła czarna kawa " +
                "o pojemności 100ml." +
                " Można dodać cukier, mleko", R.drawable.kawa));
        Kawy.add(new Coffee(1, "Espresso ", "Espresso – nazwa sposobu przygotowywania kawy w specjalnym ekspresie, przez przepuszczenie 25-35 ml " +
                " Mozna dodac cukier", R.drawable.espresso));
        Kawy.add(new Coffee(2, "Kawa GBS rozpuszczalna", "kawę rozpuszczalną z wysoką zawartością kofeiny, która finezyjnie łączy aksamitną konsystencję z niebanalną nutą jednego z 23 dostępnych smaków," +
                " Nic do kawy nie trzeba dodawac jedynie smak mozna wybrac.", R.drawable.gbs));
        Herbaty.add(new Coffee(0,"Zwykła herbata", "Zwykła herbata można dodać cukier, cytryne, mleko lub miód.",R.drawable.herbata));
        Herbaty.add(new Coffee(1,"Herbata zimowa", "Herbatka zimowa umożliwia przygotowanie pysznego, aromatycznego naparu, który przyjemnie rozgrzewa organizm. Bazę mieszanki stanowi czarna herbata, wzbogacają ją smakowite owoce maliny i pigwy, a także kłącze imbiru oraz skórka jabłka.",R.drawable.zimo));
        Herbaty.add(new Coffee(2,"Herbata z pokrzywy", "Picie herbaty z pokrzywy przyspiesza metabolizm, co sprzyja odchudzaniu. Ma ona działanie moczopędne, dlatego picie jej pomaga w chorobach nerek.",R.drawable.herba));
        Lody.add(new Coffee(0,"Lody", "Lody o różnych smakach np: czekolada, wanilia, truskawka.",R.drawable.lody));
        Lody.add(new Coffee(1,"Deser lodowy", "Deser lodowy to lody z śmietanka, owocami i różnymi dodatkami . ",R.drawable.deser));
        Lody.add(new Coffee(2,"Lody koral", "Lody koral o różnych smakach.",R.drawable.koral));

    }
}
