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
//		//klasa niesparametryzowana 
//		String s = "Napis wcze�niejszy";
//		s = "Napis p�iejszy";
//		//klasa sparametryzowana nie mo�na wykorzystywa� referencji sparametryzowanej na inny typ danych
//		//obj1 = new KlasaSparametryzowana<Double>(88.99);
//		
//		//klasa sparametryzowana dzia�a tylko dla typ�w referencyjnych
//		new KlasaSparametryzowana<Long>(101l);
//		//new KlasaSparametryzowana<long>(101l);
//		
//		//pr�ba przypisania referencji do obiektu tej samej klasy ale sparametryzowanej na inny typ ko�czy si� b��dem
//		//obj1 = obj2;
//		KlasaSparametryzowana<Integer> obj3 = new KlasaSparametryzowana<Integer>(111);
//		obj1 = obj3;
//		
//		System.out.println("Niesparametryzowanaxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//		KlasaNiesparametryzowana obj1n = new KlasaNiesparametryzowana(100);
//		Object typ3 = obj1n.getTyp();
//		//rzutowanie nie zwraca b�edu na etapie kompilacji
//		Integer typ3PoRzutowaniu = (Integer)typ3;
//		//linijka poni�ej zwr�ci b��d ClassCastException dopiero na etapie wykonywania programu. 
//		//String typ3PoRzutowaniu2 = (String)typ3;
//		obj1n.wypiszTyp();
//		System.out.println("Warto�� = "+ typ3);
//		KlasaNiesparametryzowana obj2n = new KlasaNiesparametryzowana("Tekst w klasie niesparametryzowanej");
//		obj1n = obj2n;
//		
//		KlasaSparametryzowanaDwaTypy<String, Double> objDwaTypy = new KlasaSparametryzowanaDwaTypy<String, Double>("Dwa typy", 88.99);
//		String typA = objDwaTypy.getTypA();
//		Double typB = objDwaTypy.getTypB();
//		objDwaTypy.pokazTypy();
//		System.out.println("Typ A ma rato�� "+ typA+ " typ B ma warto�� "+typB);
//		
//		Uczen uczen = new Uczen();
//		uczen.setImie("Henryk");
//		uczen.setNazwisko("Sienkiewicz");
//		KlasaSparametryzowanaDwaTypy<Uczen, Integer> dwaTypyUczen = new KlasaSparametryzowanaDwaTypy<Uczen, Integer>(uczen, 17);
//		Uczen typA2 = dwaTypyUczen.getTypA();
//		Integer typB2 = dwaTypyUczen.getTypB();
//		dwaTypyUczen.pokazTypy();
//		System.out.println(typA2 + "a jego wiek wynosi "+ typB2);
	}

}
