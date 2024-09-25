package pl.kalisz.zste.model;

import java.util.ArrayList;
import java.util.List;

import pl.kalisz.zste.R;

public class CoffeeDataSource {

    public static List<Coffee> getCoffees(){
        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("Espresso", "Espresso wywodzi się z Włoch, gdzie w 1901 Luigi " +
                "Bezzera stworzył pierwszy ekspres do espresso. Był on konstrukcją opartą na przepływie pary " +
                "i wody, co prowadziło do smakowych zmian ekstraktu. nazwa sposobu przygotowywania kawy w specjalnym " +
                "ekspresie, przez przepuszczenie 25-35 ml gorącej (90,5-96 °C) wody pod ciśnieniem 8,5-9,5 bara przez " +
                "bardzo drobno zmielone i ubite ziarna kawowca", R.drawable.espresso));
        coffees.add(new Coffee("Latte Macchiato", "Latte macchiato to bardziej fantazyjna odmiana popularnej " +
                "kawy latte. Podobnie jak latte, składa się z espresso i sporej porcji spienionego mleka, ale ma 3 " +
                "charakterystyczne warstwy: gorące mleko na dole szklanki, espresso pośrodku i warstwę mlecznej piany " +
                "na wierzchu", R.drawable.latte));
        coffees.add(new Coffee("Cappuccino", "Włoski napój kawowy z dodatkiem spienionego mleka " +
                "(rzadziej z bitą śmietaną) i szczyptą sypkiej czekolady lub kakao dla ozdoby.", R.drawable.capucinno));
        return coffees;
    }
}
