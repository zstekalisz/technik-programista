package com.example.utils;

import com.example.model.Coffee;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> kawusie = new ArrayList<>();
    public static List<Coffee> lody = new ArrayList<>();
    public static List<Coffee> wina = new ArrayList<>();
    static {
        kawusie.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.espresso));
        kawusie.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.cappucino));
        kawusie.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                " dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
        lody.add(new Coffee(0,"Sorbet", "Sorbet – rodzaj orzeźwiającego mrożonego deseru, robionego z posłodzonej wody z przewagą zamrożonych owoców, ewentualnie winem lub likierem. Pochodzenie sorbetu przypisuje się napojowi z Azji o nazwie szarbat, robionemu z posłodzonego soku owocowego i wody",R.drawable.sorbet));
        lody.add(new Coffee(1,"Lody mleczno-owocowe", "To połączenie owocowego orzeźwienia z kremową konsystencją lodów mlecznych. Do masy mlecznej dodaje się zarówno zmiksowane owoce, jak i też ich kawałki.",R.drawable.mlecznoowocowe));
        lody.add(new Coffee(2,"Mrożony jogurt", "Mrożony jogurt to mrożony deser zrobiony z jogurtu, a czasami z innych produktów mlecznych i niemlecznych. Jogurt mrożony to produkt mrożony zawierający te same podstawowe składniki co lody, ale zawierający żywe kultury bakterii.",R.drawable.mrozonyjogurt));
        wina.add(new Coffee(0,"Wino białe", "Białe wina znakomicie nadają się do posiłków z drobiem, rybami oraz owocami morza.",R.drawable.bialy));
        wina.add(new Coffee(1,"Wino różowe", "Powstaje ono w wyniku krótkotrwałego zabarwiania wina białego za pomocą skórki czerwonych winogron. Wina różowe świetnie gaszą pragnienie, dlatego powszechnym stało się podawanie ich jako schłodzonych. Sprawdzają się więc latem, oferując nie tylko pełnię smaku, ale i orzeźwienie. ",R.drawable.rozowe));
        wina.add(new Coffee(2,"Wino musujące", "Trunki tego typu wywodzą się z Szampanii położonej we Francji, a najpopularniejszą, a jednocześnie najdroższą jego odmianą jest oczywiście Szampan. Wino musujące charakteryzuje się znacznym nasyceniem dwutlenku węgla, który wytwarza się podczas fermentacji, bądź też jest do wina dodawany. W tym przypadku wyróżniamy rodzaje win musujących o smaku słodkim lub też wytrawnym. Te drugie sprawdzają się jako aperitif np. do dań w postaci zup.",R.drawable.musujace));

    }
}
