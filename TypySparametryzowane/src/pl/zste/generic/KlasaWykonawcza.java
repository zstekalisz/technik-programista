package pl.zste.generic;
public class KlasaWykonawcza {

	public static void main(String[] args) {
		Integer liczba = Integer.valueOf(100);
		KlasaSparametryzowana<Integer> obj1 = new KlasaSparametryzowana<Integer>(liczba);
		Integer typ = obj1.getTyp();
		obj1.wypiszTyp();
		System.out.println("Wartość = "+typ);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		KlasaSparametryzowana<String> obj2 = new KlasaSparametryzowana<String>(new String("Tekst"));
		String typ2 = obj2.getTyp();
		obj2.wypiszTyp();
		System.out.println("Wartość = "+typ2);

		System.out.println("Niesparametryzowana-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		KlasaNiesparametryzowana obj1n = new KlasaNiesparametryzowana(100);
		Object typ3 = obj1n.getTyp();
//		//rzutowanie nie zwraca będu na etapie kompilacji
		if(typ3 instanceof Integer) {
			Integer typ3PoRzutowaniu = (Integer)typ3;
		}
		if(typ3 instanceof String) {
			//to tu rzutowanie na string
			//String typ3PoRzutowaniu2 = (String)typ3;
		}
		//linijka poniżej zwróci błąd ClassCastException dopiero na etapie wykonywania programu. 
		//String typ3PoRzutowaniu2 = (String)typ3;
		
		obj1n.wypiszTyp();
		KlasaNiesparametryzowana obj2n = new KlasaNiesparametryzowana("Tekst w klasie niesparametryzowanej");
		//próba podmiany referencji o innych sparametryzowanych typach kończy się błędem na etapie kompilacji
		//obj1 = obj2;
		//dla klas działających na Object nie ma mechanizmu sprawdzającego
		obj1n = obj2n;
		
		System.out.println("Dwa parametry - zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		KlasaSparametryzowanaNaDwaTypy<String, Double> objDwaTypy = 
				new KlasaSparametryzowanaNaDwaTypy<String, Double>("Dwa typy", 88.99);
		String typA = objDwaTypy.getTypA();
		Double typB = objDwaTypy.getTypB();
		objDwaTypy.pokazTypy();
		System.out.println("Typ A ma wartość "+ typA+ " typ B ma wartość "+typB);
		
		Uczen uczen = new Uczen();
		uczen.setImie("Henryk");
		uczen.setNazwisko("Sienkiewicz");
		uczen.setWiek(140);
		int i = 17;
		KlasaSparametryzowanaNaDwaTypy<Uczen, Integer> dwaTypyUczen = 
				new KlasaSparametryzowanaNaDwaTypy<Uczen, Integer>(uczen, i);
//		Uczen typA2 = dwaTypyUczen.getTypA();
//		Integer typB2 = dwaTypyUczen.getTypB();
//		dwaTypyUczen.pokazTypy();
//		System.out.println(typA2 + "a jego wiek wynosi "+ typB2);
	}

}
