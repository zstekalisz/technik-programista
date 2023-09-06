package pl.zste.osoby;

import pl.zste.enums.Miesiace;

public class UczenZSTE {
	
	private Miesiace egzaminMaturalny = Miesiace.maj;
	private Miesiace[] egzaminyZawodowe = {Miesiace.styczen, Miesiace.luty, Miesiace.maj, Miesiace.czerwiec};
	//private Miesiace egzaminMaturalnyTest = new Miesiace(); nie da się stworzyć instancji enuma
	//bo są to domyślnie statycznie zdefiniowane stałe, a skoro statycznie to odwołujemy się poprzez nazwę 
	//typu operator kropki i nazwę stałej
}
