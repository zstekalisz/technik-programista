package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> kawy = new ArrayList<>();
    public static List<Coffee> przekąski = new ArrayList<>();
    public static List<Coffee> drinki = new ArrayList<>();
    static {
        kawy.add(new Coffee(0, "Espresso", "Espresso to silnie skoncentrowany rodzaj kawy przygotowywany przez przepuszczenie gorącej wody pod ciśnieniem przez drobno zmielone ziarna kawy. Proces parzenia espresso jest bardzo krótki i trwa zazwyczaj od 25 do 30 sekund.", R.drawable.espresso));
        kawy.add(new Coffee(1, "Macchiato", "Macchiato to kawa przygotowana przez dodanie do niej niewielkiej ilości mleka lub mlecznej pianki. Nazwa macchiato pochodzi z języka włoskiego i oznacza \"plamka\" lub \"skaza\".", R.drawable.macchiato));
        kawy.add(new Coffee(2, "Con panna", "Kawa con panna jest często podawana w eleganckich kawiarniach jako luksusowy napój. Bitą śmietaną dodaje się na wierzch kawy, co nadaje jej kremową konsystencję i delikatny smak. Kawa con panna jest doskonałą opcją dla miłośników kawy.", R.drawable.conP));
        przekąski.add(new Coffee(0,"Pizza", " Pizza to potrawa kuchni włoskiej, która jest obecnie szeroko rozpowszechniona na całym świecie. Składa się z płaskiego placeka z ciasta drożdżowego, z sosem pomidorowym, posypany tartym serem (najczęściej mozzarellą) i ziołami.",R.drawable.pizza));
        przekąski.add(new Coffee(1,"Tosty", " rodzaj kanapki z opiekacza, która składa się z dwóch kawałków chleba tostowego zapieczonego z serem i wędliną w środku.",R.drawable.tosty));
        przekąski.add(new Coffee(2,"Zapiekanka", "Zapiekanka to rodzaj przekąski, nazywanej potocznie polską pizzą. Składa się z ćwiartki bagietki posmarowanej mieszanką smażonych pieczarek i cebuli, a następnie posypanej dużą ilością startego sera. Można dodać szynkę i ketchup. ",R.drawable.zapiekanka));
        drinki.add(new Coffee(0,"Piña Colada", "Słodki drink, który idealnie nadaje się na lato! Może kojarzyć się z plażą, morzem i pięknym słońcem.",R.drawable.pina));
        drinki.add(new Coffee(1,"Mohito", "Bez wątpienia Mohito można zaliczyć do najlepszych drinków. Lekki i orzeźwiający idealnie sprawdzi się podczas upalnych dni. ",R.drawable.mohito));
        drinki.add(new Coffee(2,"Cuba Libre", "Kolejna propozycja pochodzi prosto z gorącej Kuby, czyli królestwa rumu. To charakterystyczny drink, który przypadnie do gustu poszukiwaczom wyjątkowych smaków.",R.drawable.cuba));

    }
}
