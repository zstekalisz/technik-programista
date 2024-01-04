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
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.coffe1));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.coffe2));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                "dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.coffe3));
        piwa.add(new Coffee(0,"Złoty Zefir",
                "Złoty Zefir to piwo o lekkim złocistym kolorze, które przenosi cię na chmurki delikatnego smaku. Jego aksamitna gładkość jest jak miękka kołdra, otulając twoje zmysły nutami słodu, miodu i lekkiej wanilii. To piwo, które koi duszę i pobudza wyobraźnię.",R.drawable.piwo1));
        piwa.add(new Coffee(1,"Bursztynowy Brzask", "Bursztynowy Brzask to piwo o głębokim, ciepłym bursztynowym odcieniu, które jest prawdziwym rarytasem dla smakoszy. Jego intensywny aromat cytrusów, karmelu i subtelnej goryczki sprawia, że każdy łyk jest jak magiczny moment wschodu słońca. To piwo dla tych, którzy cenią piękno prostoty i elegancji.",R.drawable.piwo2));
        piwa.add(new Coffee(2,"Mocne Mocarstwo", "Mocne Mocarstwo to piwo dla odważnych, którzy nie boją się sięgnąć po coś wyjątkowego. Jego głęboki, miedziany kolor ukrywa potężną moc w każdym łyku. Smak to połączenie intensywnych nut kawy, gorzkiej czekolady i lekkiej nuty dębu. To piwo, które zyskuje szacunek każdym krokiem, jakiego się odważysz podjąć.",R.drawable.piwo2137));
        przekaski.add(new Coffee(0,"Rajskie Marzenie", "Rajskie Marzenie to ciasto, które przynosi smakowy raj dla podniebienia. Jego puszyste, lekkie ciasto rozpływa się w ustach, a każdy kęs jest jak słodki sen. Wnętrze tego ciała ukrywa mięciutki krem z wanilii, który jest jak chmurka z marzeń. Posypka z kawałków czekolady i świeżych owoców dodaje mu nuty wyjątkowego uroku. To ciasto, które sprawia, że chciałbyś, aby każdy dzień smakował jak raj.",R.drawable.cake1));
        przekaski.add(new Coffee(1,"Karmelowe Uniesienie", "Karmelowe Uniesienie to ciasto dla miłośników słodkości, którzy pragną podróży przez świat karmelu. Jego wilgotne, karmelizowane ciasto rozpływa się w ustach, uwalniając intensywny smak karmelu i delikatną nutę soli. Warstwa karmelowego lukru wtapia się w ciasto, tworząc niebiańską harmonię smaków. Każdy kęs jest jak uniesienie do karmelowego nieba.",R.drawable.cake2));
        przekaski.add(new Coffee(2,"Oreo Wir", "Oreo Wir to ciasto dla poszukiwaczy przygód smakowych. Jego miękkie ciasto czekoladowe jest przesycone kawałkami chrupiących Oreo, tworząc wir smaków i tekstur. Warstwa kremu o smaku wanilii jest jak oaza słodyczy w tym wirze, uzupełniając kakaowy szaleństwo. To ciasto, które zaprasza do eksploracji i odkrywania nowych smaków w każdym kęsie.",R.drawable.cake3));
    }
}
