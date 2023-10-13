package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> kawy = new ArrayList<>();
    public static List<Coffee> Ciasto = new ArrayList<>();
    public static List<Coffee> Herbata = new ArrayList<>();
    static {
        kawy.add(new Coffee(0, "Breve", "To Amerykańskie podejście do włoskiego cappuccino, " +
                " które robi się z pół na pół śmietany i mleka.", R.drawable.breve));
        kawy.add(new Coffee(1, "Cortado", "pochodzący z Hiszpanii napój składający się z espresso zmieszanego mniej więcej w proporcji pół na pół " +
                " z ciepłym mlekiem w celu zmniejszenia kwasowości kawy. Mleko w cortado jest parzone, ale nie jest spienione.", R.drawable.cortado));
        kawy.add(new Coffee(2, "Lungo", "to jedna z modyfikacji espresso, tzw. przedłużone espresso – kawa o trzykrotnie " +
                " większej objętości niż espresso, co jest efektem dłuższego czasu parzenia.", R.drawable.lungo));
        Ciasto.add(new Coffee(0,"Jabłecznik", " Według polskich podręczników do gastronomii, jabłeczniki (szarlotki) to placki z nadzieniem z kwaśnych jabłek, znajdującym się między dwoma warstwami ciasta kruchego (w tym półkruchego).",R.drawable.jablecznik));
        Ciasto.add(new Coffee(1,"Sernik", " Masa serowa składa się z serka śmietankowego (cream cheese), śmietany, jajek i cukru[1]. Spód wykonuje się z krakersów z mąki graham zmieszanych z masłem",R.drawable.sernik));
        Ciasto.add(new Coffee(2,"Murzynek", "Opis. Murzynek ma bogate wartości odżywcze, tj.: magnez, fosfor, żelazo, sód, wapń, potas oraz witaminy: A, C, PP, B1, B2, B6. Ten wysokobiałkowy pokarm dostarcza ptakom podstawowej energii. Zawiera najlepiej wchłanialny olej roślinny i często stanowi wartości odżywczenik mieszanek dla kanarków. ",R.drawable.murzynek));
        Herbata.add(new Coffee(0,"Herbata czarna.", "rodzaj herbaty, która jest bardziej utleniona niż herbata ulung, żółta, biała i zielona. Czarna herbata ma na ogół mocniejszy smak niż inne herbaty.",R.drawable.herbataczarna));
        Herbata.add(new Coffee(1,"Herbata zielona", "Zielona herbata jest naparem przygotowywanym z liści herbaty chińskiej (Camellia sinensis). Jej kolebką są południowe Chiny, a obecnie uprawy znajdują się również w innych krajach azjatyckich (np. w Japonii, na Tajwanie, w Indiach), w Afryce i w Ameryce Południowej.",R.drawable.herbatazielona));
        Herbata.add(new Coffee(2,"Herbata biała", "Biała herbata to rodzaj herbaty, którą zbiera się bardzo wcześnie - kiedy liście mają formę pąków. Są pokryte białym meszkiem, stąd też nazwa herbaty.",R.drawable.herbatabiala));

    }
}
