package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> coffies = new ArrayList<>();
    public static List<Coffee> driny = new ArrayList<>();
    public static List<Coffee> zagrycha = new ArrayList<>();
    static {
        coffies.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.espresso));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.cappucino));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                " dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
        driny.add(new Coffee(0,"Kamikaze", "Prosty i bardzo popularny w barach drink typu shot, czyli do wypicia na raz, 50 ml wódki 50 ml likieru Blue curacao 50 ml soku z cytryny",R.drawable.kamikaze));
        driny.add(new Coffee(1,"Wściekły pies", "Słodko-gorzko-ostry o pięknej, czerwonej barwie – został wymyślony w Polsce! Ten biało-, a raczej bezbarwnie-czerwony drink pochodzi ze Świnoujścia, a jego autorem jest Darek Ryżczak. Zainspirowany filmem Quentina Tarantino – hitem lat ’90. pt.: „Wściekłe psy” - nadał nazwę swojemu drapiącemu w gardło minikoktajlowi, który można znaleźć dziś w każdym barze!",R.drawable.pies));
        driny.add(new Coffee(2,"Mojito", " Koktajl alkoholowy, pochodzenia kubańskiego na bazie białego rumu o orzeźwiającym słodko-kwaśno-miętowym smaku. Podstawowymi składnikami są:",R.drawable.mojito));
        zagrycha.add(new Coffee(0,"Pizza", "Potrawa kuchni włoskiej, obecnie szeroko rozpowszechniona na całym świecie, gdzie powstały jej nowe warianty.",R.drawable.pizza));
        zagrycha.add(new Coffee(1,"Ogórek kiszony", "Artykuł spożywczy powszechnie znany w Europie Środkowej i Wschodniej. Powstaje z ogórków gruntowych złożonych w beczce z twardego niesmolistego drewna[1], w garnku kamiennym lub słoju, z dodatkiem łodyg i baldachów kopru, korzeni chrzanu, ząbków czosnku zalanych wodą z solą (niejodowaną), które podlegają kiszeniu.",R.drawable.ogorek));
        zagrycha.add(new Coffee(2,"Pomidor", "Pokrojny pomidor na zagryche",R.drawable.pomidor));

    }
}
