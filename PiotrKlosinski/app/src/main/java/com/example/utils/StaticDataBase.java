package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> coffies = new ArrayList<>();
    public static List<Coffee> napoje = new ArrayList<>();
    public static List<Coffee> zakonski = new ArrayList<>();
    static {
        coffies.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.coffe1));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.coffe2));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                "dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.coffe3));
        napoje.add(new Coffee(0,"Amarena", "Wino Amarena to wyjątkowe wino deserowe o intensywnym smaku i aromacie wiśni amaren. Ma głęboki czerwony kolor i doskonale komponuje się z deserami, zwłaszcza na bazie czekolady lub owoców. Idealne do degustacji jako elegancki deser lub aperitif.",R.drawable.amarena ));
        napoje.add(new Coffee(1,"Snajper", "Wino Snajper brzoskwiniowe to lekkie i owocowe wino, o słodkim smaku brzoskwiń, idealne jako aperitif lub do letnich spotkań. Jego delikatny aromat i różowy kolor czynią je wyjątkowo uroczym i orzeźwiającym wyborem.",R.drawable.snajper));
        napoje.add(new Coffee(2,"Kuflowe mocne", "Piwo kuflowe mocne to intensywne, mocniejsze piwo z pełnym smakiem i wyrazistym aromatem, idealne na wieczorne spotkania i do dań mięsnych.",R.drawable.kuflowe));
        zakonski.add(new Coffee(0,"Kiełbasa", "Kiełbasa to tradycyjna, smakowita zakąska, idealna na różne przyjęcia. Jej wyrazisty smak i możliwość serwowania z różnymi dodatkami sprawiają, że zawsze jest popularnym wyborem.",R.drawable.kielbasa));
        zakonski.add(new Coffee(1,"Chipsy", "Chipsy to chrupiąca i słona przekąska, idealna na różne okazje, popularna ze względu na swój smak i wygodę. Chętnie wybierana zarówno na spotkaniach towarzyskich, jak i na chwile relaksu przed telewizorem.",R.drawable.czipsy));
        zakonski.add(new Coffee(2,"Ogórki małosolne", "Ogórki małosolne to tradycyjna i oszałamiająco orzeźwiająca zakąska, która doskonale komponuje się z innymi przysmakami na różnego rodzaju przyjęciach. Z ich wyrazistym smakiem i chrupiącą konsystencją stanowią doskonałe urozmaicenie na stole.",R.drawable.ogurki));
    }
}
