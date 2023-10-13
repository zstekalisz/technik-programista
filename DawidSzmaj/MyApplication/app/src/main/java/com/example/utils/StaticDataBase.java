package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> kawy = new ArrayList<>();
    public static List<Coffee> wódka = new ArrayList<>();
    public static List<Coffee> ciasta = new ArrayList<>();
    static {
        kawy.add(new Coffee(0, "Breve", "To Amerykańskie podejście do włoskiego cappuccino, " +
                " które robi się z pół na pół śmietany i mleka.", R.drawable.breve));
        kawy.add(new Coffee(1, "Cortado", "pochodzący z Hiszpanii napój składający się z espresso zmieszanego mniej więcej w proporcji pół na pół " +
                " z ciepłym mlekiem w celu zmniejszenia kwasowości kawy. Mleko w cortado jest parzone, ale nie jest spienione.", R.drawable.cortado));
        kawy.add(new Coffee(2, "Lungo", "to jedna z modyfikacji espresso, tzw. przedłużone espresso – kawa o trzykrotnie " +
                " większej objętości niż espresso, co jest efektem dłuższego czasu parzenia.", R.drawable.lungo));
        wódka.add(new Coffee(0,"Stock", " Stock ma delikatny smak i dobrze pasuje do różnych drinków. Stock jest popularną wódką na wesela i inne okazje, ze względu na swoją jakość i cenę.",R.drawable.stock));
        wódka.add(new Coffee(1,"Belvedere", " Belvedere ma dosyć mocny smak, ale doskonale sprawdza się w koktajlach.",R.drawable.belvedere));
        wódka.add(new Coffee(2,"Amundsen", "Amundsen to najwyższej klasy wódka, która powstała na bazie krystalicznie czystej wody. Swój lodowy charakter, nieskazitelną czystość i wyjątkowo łagodny smak zawdzięcza naturalnemu pochodzeniu oraz unikalnej tradycji produkowania. ",R.drawable.amudsen));
        ciasta.add(new Coffee(0,"Chałka", "Chałka Tradycyjne, słodkie, jidyszkie chlebki warkoczowe, popularne w okresie świątecznym, szczególnie na Szabat.",R.drawable.chalka));
        ciasta.add(new Coffee(1,"Karpatka", "Karpatka cieszy się dużą popularnością w Polsce i jest często podawane na różnego rodzaju okazjach. Smak karpatki jest subtelny, a konsystencja jest bardzo przyjemna ",R.drawable.karpatka));
        ciasta.add(new Coffee(2,"Sernik", "Sernik to pyszny deser, który składa się z chrupiącego spodu, zazwyczaj z herbatników lub ciastek połączonych masłem, oraz gładkiego nadzienia serowego z dodatkiem jajek, cukru, i często aromatyzowanego wanilią.",R.drawable.sernik));

    }
}
