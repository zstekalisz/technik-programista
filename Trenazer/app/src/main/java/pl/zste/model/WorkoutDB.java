package pl.zste.model;

import java.util.ArrayList;
import java.util.List;

public class WorkoutDB {

    public static List<Workout> workouts = new ArrayList<>();

    static {
        workouts.add(new Workout("Rozciąganie kończyn", "Pięć pompek w staniu na rękach, \n" +
                "Dziesięć przysiadów na jednej nodze, \n" +
                "Piętnaście podciągnięć."));
        workouts.add(new Workout("Ogólna agonia","Sto podciągnięć, \n" +
                "Sto pompek, \n Sto brzuszków, \n Sto przysiadów."));
        workouts.add(new Workout("Tylko dla mięczaków","Pięć podciągnięć, \n" +
                "Dziesięć pompek, \n" +
                "Piętnaście przysiadów."));
        workouts.add(new Workout("Siła i dystans", "Bieg na 500 metrów \n" +
                "Dwadzieścia jeden wydźwignięć ciężarka, \n" +
                "Dwadzieścia jeden podciągnięć"));
    }
}
