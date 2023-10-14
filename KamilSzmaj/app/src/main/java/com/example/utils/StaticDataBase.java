package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> coffies = new ArrayList<>();
    public static List<Coffee> zimneNapoje = new ArrayList<>();
    public static List<Coffee> alkohole = new ArrayList<>();
    static {
        coffies.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.espresso));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.cappucino));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                " dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
        zimneNapoje.add(new Coffee(0,"Sprite", "Sprite to orzeźwiający napój gazowany o cytrynowym smaku. Jest często postrzegany jako lekka alternatywa dla innych napojów gazowanych ze względu na brak kofeiny i naturalny smak cytryny-limonki. Wiele osób ceni go za jego delikatność i orzeźwiający charakter. Jest to popularny wybór, szczególnie w gorące dni.",R.drawable.sprite));
        zimneNapoje.add(new Coffee(1,"Coca-Cola", "Coca-Cola to popularny napój gazowany o charakterystycznym słodkim i orzeźwiającym smaku. Ma szerokie grono miłośników na całym świecie, ale jednocześnie jest kontrowersyjna ze względu na wysoką zawartość cukru i kalorii. Dla niektórych jest ulubionym napojem, który doskonale gasi pragnienie i idealnie pasuje do potraw fast food, natomiast inni zwracają uwagę na negatywny wpływ spożycia dużych ilości cukru na zdrowie. Ostatecznie, opinia o Coli zależy od indywidualnych preferencji smakowych i podejścia do zdrowego stylu życia.",R.drawable.cola));
        zimneNapoje.add(new Coffee(2,"Fanta", "Fanta to napój gazowany o intensywnym owocowym smaku, dostępny w wielu różnych wariantach, takich jak pomarańczowy, cytrynowy, truskawkowy i wiele innych. To słodka i kolorowa alternatywa dla innych napojów gazowanych. Dla wielu osób jest smacznym przysmakiem, ale trzeba uważać z jej spożyciem ze względu na wysoką zawartość cukru. Ogólnie rzecz biorąc, Fanta to popularna i słodka przyjemność, która cieszy się sporą popularnością wśród młodszych konsumentów.",R.drawable.fanta));
        alkohole.add(new Coffee(0,"Bocian", "Bocian to popularna marka wódki, produkowana w Polsce. Jest ceniona przez niektórych miłośników alkoholu za jej jakość i tradycyjny charakter. Jednak warto podkreślić, że nadmierna konsumpcja alkoholu, w tym wódki, może być szkodliwa dla zdrowia. Dlatego ważne jest picie z umiarem i z poszanowaniem lokalnych przepisów dotyczących spożycia alkoholu.",R.drawable.bocian));
        alkohole.add(new Coffee(1,"Lech", "Lech to popularna marka piwa pochodząca z Polski. Jest to popularny wybór wśród wielu miłośników piwa, ze względu na swoją różnorodność smaków i dostępność. Jednak jak w przypadku alkoholu, ważne jest picie z umiarem, aby unikać nadmiernego spożycia alkoholu, które może być szkodliwe dla zdrowia.",R.drawable.lech));
        alkohole.add(new Coffee(2,"Jack Daniels", "Jack Daniel's to znana marka amerykańskiej whisky, która jest ceniona przez wielu miłośników alkoholu na całym świecie. Charakteryzuje się wyjątkowym smakiem i aromatem, często opisywanym jako wyrazisty, z delikatnymi nutami dębu i karmelu. Ma swoją unikalną historię i tradycję produkcji, co przyciąga wielu entuzjastów. Jednak, jak w przypadku wszelkich alkoholi, ważne jest spożywanie Jack Daniel's z umiarem i z poszanowaniem przepisów dotyczących alkoholu w danym regionie.",R.drawable.jack));

    }
}
