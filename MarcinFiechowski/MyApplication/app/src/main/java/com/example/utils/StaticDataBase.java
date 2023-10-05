package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> coffies = new ArrayList<>();
    public static List<Coffee> piwa = new ArrayList<>();
    public static List<Coffee> przekaski = new ArrayList<>();
    static {
        coffies.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.espresso));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.cappucino));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                " dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
        piwa.add(new Coffee(0,"Piwny Bączek 10%", "Intensywny trunek z mocnym smakiem i znaczną zawartością alkoholu, doskonały dla miłośników piw o wyrazistej charakterystyce. Mocna propozycja dla entuzjastów piw craftowych.",R.drawable.baczek));
        piwa.add(new Coffee(1,"Żubr", "klasyczny wybór o lekkim smaku i przyjemnej goryczce, idealne na relaksacyjny wieczór z przyjaciółmi. To popularne piwo zasługuje na uznanie ze względu na swój łagodny charakter i dobrą jakość w swojej kategorii cenowej",R.drawable.zubr));
        piwa.add(new Coffee(2,"Harnaś", "Tradycyjna, pełna smaku propozycja, która doskonale sprawdzi się w chłodne wieczory.",R.drawable.harnas));
        przekaski.add(new Coffee(0,"Sernik", "Sernik to pyszny, kremowy deser, który zachwyca swoim smakiem i delikatną teksturą. To prawdziwa rozkosz dla podniebienia.",R.drawable.sernik));
        przekaski.add(new Coffee(1,"Murzynek", "Tradycyjne, polskie ciasto, które urzeka swoim bogatym smakiem czekoladowym i wilgotną konsystencją. ",R.drawable.murzynek));
        przekaski.add(new Coffee(2,"Tiramisu", "Prawdziwy rarytas wśród deserów - delikatne, kremowe i pełne aromatu. Połączenie kawy, sera mascarpone i kakao sprawia, że każdy kęs to prawdziwa rozkosz dla podniebienia.",R.drawable.tiramisu));

    }
}
