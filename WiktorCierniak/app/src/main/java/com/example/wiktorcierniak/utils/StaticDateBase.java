package com.example.wiktorcierniak.utils;

import com.example.wiktorcierniak.R;
import com.example.wiktorcierniak.model.Alkohol;
import com.example.wiktorcierniak.model.Coffee;
import com.example.wiktorcierniak.model.Napoje;

import java.util.ArrayList;
import java.util.List;

public class StaticDateBase {

    public static List<Coffee> coffies = new ArrayList<>();
    public static List<Napoje> napojes = new ArrayList<>() ;
    public static List<Alkohol> alkohols = new ArrayList<>();
    static {
        coffies.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.espresso));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.cappucino));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                " dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
        alkohols.add(new Alkohol(0,"Wódka","wysokoprocentowy napój alkoholowy uzyskiwany przez zmieszanie w " +
                "odpowiednich proporcjach spirytusu rektyfikowanego z wodą. ",R.drawable.wudka));
        alkohols.add(new Alkohol(1,"Whisky","napój alkoholowy spirytusowy powstały z destylacji zacieru " +
                "zbożowego i poddawany dojrzewaniu w drewnianych beczkach. ",R.drawable.whe));
        alkohols.add(new Alkohol(2,"Rum","apój alkoholowy o wysokiej zawartości alkoholu wytwarzany ze " +
                "sfermentowanego soku z trzciny cukrowej, koncentratu tego soku lub melasy.",R.drawable.download));
        napojes.add(new Napoje(0,"Cola","słodki napój gazowany, początkowo wytwarzany z soku z owoców " +
                "drzewa koli i krzewu koki, zmieszanych z wodą sodową.",R.drawable.cola));
        napojes.add(new Napoje(1,"Fanta","Fanta to amerykańska niemiecka marka gazowanych " +
                "napojów bezalkoholowych o smaku owocowym",R.drawable.fanta));
        napojes.add(new Napoje(2,"Sprite","marka napoju gazowanego o smaku cytrynowo-limonkowym " +
                "należąca do The Coca-Cola Company.",R.drawable.sprite));

    }

}
