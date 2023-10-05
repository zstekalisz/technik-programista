package utils;

import com.example.model.Coffee;
import com.example.zadanie.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {
    public static List<Coffee> coffies = new ArrayList<>();
    static{
        coffies.add(new Coffee(0,"Espresso","Espresso – nazwa sposobu przygotowywania kawy w specjalnym ekspresie, przez przepuszczenie 25-35 ml gorącej (90,5-96 °C) wody.", R.drawable.espresso));
        coffies.add(new Coffee(1,"Capupucino","Cappucino - uproszczona: kapputczino) – włoski napój kawowy z dodatkiem spienionego mleka (rzadziej z bitą śmietaną) i szczyptą sypkiej czekolady lub kakao dla ozdoby", R.drawable.cappucino));
        coffies.add(new Coffee(2,"Latte macchiato","Latte macchiato – napój mleczny powstały przez powolne (delikatnie, po ściance) dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
    }
}

