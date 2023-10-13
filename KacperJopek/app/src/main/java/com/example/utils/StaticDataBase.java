package com.example.utils;

import com.example.model.Coffee;
import com.example.model.Napojezimne;
import com.example.model.Sniadania;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class StaticDataBase {

    public static List<Coffee> coffies = new ArrayList<>();
    public static List<Coffee> napojezimne = new ArrayList<>();
    public static List<Coffee> sniadania = new ArrayList<>();
    static {
        coffies.add(new Coffee(0, "Espresso", "Espresso serwowane w małej, ogrzanej przed podaniem filiżance " +
                "o pojemności ok. 70 ml, wypełnia ją do połowy." +
                " Pite jest zarówno z cukrem, jak i bez", R.drawable.espresso));
        coffies.add(new Coffee(1, "Cappucino", "Włoski napój kawowy z dodatkiem spienionego mleka lub z bitą śmietaną " +
                "i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.cappucino));
        coffies.add(new Coffee(2, "Latte macchiato", "Napój mleczny powstały przez powolne,delikatnie, po ściance," +
                " dolanie kawy espresso do gorącego mleka, pokrytego warstwą mlecznej piany.", R.drawable.lattemacchiato));
        napojezimne.add(new Coffee(0,"Smoothie owocowe", "Smoothie owocowe to pyszny i zdrowy napój przygotowywany z różnych świeżych owoców. Owoce takie jak banany, truskawki, maliny, mango, ananasy lub jagody są mieszane w mikserze z jogurtem naturalnym lub mlekiem, a czasem z dodatkiem miodu lub syropu klonowego, aby nadać smakowi słodyczy. Smoothie owocowe jest gładkie i kremowe dzięki blendowaniu, co sprawia, że jest idealnym napojem na gorące dni lub jako szybka przekąska w ciągu dnia. To doskonały sposób na dostarczenie organizmowi witamin, minerałów i błonnika z owoców w łatwo przyswajalnej formie. Możesz dostosować skład smoothie według swoich upodobań, tworząc własne unikalne połączenia smakowe.",R.drawable.smoothie));
        napojezimne.add(new Coffee(1,"Frappuccino kawowy", "Frappuccino kawowy to pyszny napój mrożony, który stanowi doskonałe połączenie świeżo parzonej kawy, mleka, lodu i słodkiego syropu. Jest to ulubiona opcja wielu miłośników kawy, szczególnie w gorące dni. Frappuccino kawowy jest serwowany w kawiarniach, często ozdobiony bitą śmietaną na wierzchu oraz posypany wiórkami czekolady lub kakao. Jego chłodzący smak kawy, delikatna słodycz i kremowa konsystencja sprawiają, że jest idealnym wyborem zarówno na orzeźwiający napój, jak i małą przyjemność dla podniebienia.",R.drawable.frappucino));
        napojezimne.add(new Coffee(2,"Koktajl bananowy", "Koktajl bananowy to pyszny i kremowy napój przygotowywany z dojrzałych bananów. Jest to doskonały wybór na gorący dzień lub jako zdrowa przekąska. Aby przygotować koktajl bananowy, wystarczy zmiksować banany z lodem (opcjonalnie), mlekiem lub jogurtem, oraz ewentualnie dodać słodzidło, takie jak miód lub syrop klonowy, jeśli potrzebujesz słodszej nuty. Ten koktajl jest pełen witamin, minerałów i błonnika, co sprawia, że jest nie tylko smaczny, ale także zdrowy. Możesz również dodać do niego dodatkowe składniki, takie jak orzechy, cynamon, czy kakao, by nadać mu różnorodne smaki. Koktajl bananowy to doskonała opcja dla tych, którzy cenią sobie prostotę i smak natury.",R.drawable.koktajlbananowy));
        sniadania.add(new Coffee(0,"Jajecznica", "Jajecznica to pyszne danie śniadaniowe, które przygotowuje się z jajek. Jajka są roztrzepane i smażone na patelni wraz z różnymi dodatkami, takimi jak posiekane warzywa, ser, boczek, szynka lub przyprawy. Danie jest często przygotowywane na maśle lub oleju i serwowane na gorąco. Jajecznica jest lekka, sycąca i bardzo popularna na całym świecie. Można ją dostosować do własnych upodobań, co czyni ją wszechstronnym i smacznym posiłkiem na każdą porę dnia.",R.drawable.jajecznica));
        sniadania.add(new Coffee(1,"Owsianka", "Owsianka to zdrowe i pożywne śniadanie przygotowane z płatków owsianych, które są gotowane w mleku, wodzie lub roślinnym mleku. To danie oferuje doskonałe źródło błonnika, witamin i minerałów, takich jak magnez i żelazo. Owsianka może być spersonalizowana poprzez dodawanie ulubionych owoców, orzechów czy miodu, co czyni ją smaczną i sycącą opcją na rozpoczęcie dnia.",R.drawable.owsianka));
        sniadania.add(new Coffee(2,"Musli z jogurtem i owocami", "Musli z jogurtem i owocami to pyszne i zdrowe śniadanie, które łączy w sobie kilka smaków i tekstur. Składa się z chrupiących musli, które są zazwyczaj mieszanką płatków owsianych, orzechów, nasion, suszonych owoców i miodu, co nadaje im słodki smak i chrupiącą konsystencję. Na wierzchu znajduje się kremowy jogurt, który nadaje całości aksamitności i dodaje białka do diety. Wisienką na torcie są świeże owoce, takie jak truskawki, jagody, kiwi, banany lub maliny, które dodają świeżości, soczystości i naturalnej słodyczy. To połączenie smaków i tekstur sprawia, że musli z jogurtem i owocami jest doskonałym wyborem dla tych, którzy szukają zdrowego i smacznego posiłku na początek dnia.",R.drawable.musli));

    }
}
