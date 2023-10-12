package com.example.utiles;

import com.example.model.Coffee;
import com.example.model.Dania;
import com.example.model.Piwa;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDateBase {

    public static List<Coffee> coffies = new ArrayList<>();

    public static List<Dania> danias = new ArrayList<>() ;

    public static List<Piwa> piwas = new ArrayList<>();
    static {
        coffies.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.espresso));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.cappucino));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                " dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
        danias.add(new Dania(0,"Bigos z Cukini","Tradycyjny bigos z dodatkiem cukini",R.drawable.bigos_z_cukini));
        danias.add(new Dania(1,"Gołąbki z Makarone","Gołąbki z miały być z ziemniakami ale z " +
                "powodu lenistwa pewnej osoby(mnie) są z makaronem",R.drawable.golabki_z_makaronem));
        danias.add(new Dania(2,"Krupnik","zupa na wywarze jarzynowym lub mięsnym zasypana kaszą jęczmienną," +
                " z ziemniakami lub ryżem(głównie z ziemnakami)",R.drawable.krupnik));
        piwas.add(new Piwa(0,"Lech","marka piwa produkowanego przez browar Lech Browary " +
                "Wielkopolski należący do Kompanii Piwowarskiej",R.drawable.lech));
        piwas.add(new Piwa(1,"Żubr","marka jasnego, pasteryzowanego piwa, na bazie słodu jęczmiennego" +
                " warzonego przez koncern Kompania Piwowarska SA. Zawiera 12,1% ekstraktu oraz 6,0% alkoholu.",R.drawable.zubr));
        piwas.add(new Piwa(2,"Tatra","marka piwa produkowana przez Browar Elbląg, Browar Leżajsk i Browar Warka" +
                " należące do Grupy Żywiec",R.drawable.tatra));
    }
}
