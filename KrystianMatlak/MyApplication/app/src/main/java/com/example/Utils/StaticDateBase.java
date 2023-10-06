package com.example.Utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDateBase {

    public static List<Coffee> coffees = new ArrayList<>();
    static {
        coffees.add(new Coffee(0,"Espresso","Espresso – nazwa sposobu przygotowywania kawy w specjalnym ekspresie," +
                " przez przepuszczenie 25-35 ml gorącej wody pod ciśnieniem 8,5-9,5 bara przez bardzo drobno zmielone" +
                " i ubite ziarna kawowca" , R.drawable.espresso));
        coffees.add(new Coffee(1,"Cappucino","włoski napój kawowy z dodatkiem spienionego mleka i szczyptą sypkiej" +
                " czekolady lub kakao dla ozdoby.",R.drawable.cappucino));
        coffees.add(new Coffee(2,"Latte Macchiato","",R.drawable.lattemacchiato));
    }
}
