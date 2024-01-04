package pl.zste.maps;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapaCwiczenia {

	public static void main(String[] args) {
		String klucz1 = "Jasne";
		String klucz2  = "Bursztynowe";
		String klucz3 = "Brązowe";
		String klucz4 ="Ciemne";
		String klucz1en = "Clear";
		String klucz2en = "Amber";
		String klucz3en = "Brown";
		String klucz4en = "Dark";
		
		List<String> piwaJasne = new ArrayList<String>(Arrays.asList("Perła","Kapitan Dżek","Lech"));
		List<String> piwaBursztynowe = new ArrayList<String>(Arrays.asList("Lubicz","Komes","Bractwo"));
		List<String> piwaBrazowe = new ArrayList<String>(Arrays.asList("Perła Chmielowa","Żubr","Piwoja"));
		List<String> piwaCiemne = new ArrayList<String>(Arrays.asList("Porter","Palone","Fortuna", "Namysłów"));
		List<String> piwaJasneEn = new ArrayList<String>(Arrays.asList("Pearl","Capitan Jack","Lech"));
		List<String> piwaBursztynoweEn = new ArrayList<String>(Arrays.asList("Lubicz","Comes","Brotherhood"));
		List<String> piwaBrazoweEn = new ArrayList<String>(Arrays.asList("Pearl of Chmielowa","Wisent","Beer"));
		List<String> piwaCiemneEn = new ArrayList<String>(Arrays.asList("Porter","Roasted","Fortune", "Namysłów"));
		
		Map<String, List<String>> mapa = new HashMap<>();
		List<String> ostatniaWartoscKlucz1 = mapa.put(klucz1, piwaJasne);
		if(ostatniaWartoscKlucz1==null)System.out.println("klucz "+klucz1+ " nie istniał wcześniej");
		mapa.put(klucz2, piwaBrazowe);
		mapa.put(klucz3, piwaBrazowe);
		mapa.put(klucz4, piwaCiemne);
		mapa.put(klucz1en, piwaJasneEn);
		mapa.put(klucz2en, piwaBursztynoweEn);
		mapa.put(klucz3en, piwaBrazoweEn);
		mapa.put(klucz4en, piwaCiemneEn);
		
		List<String> listaPiwBursztonowychEn = mapa.get("Amnber");
		if(listaPiwBursztonowychEn==null) System.out.println("Klucz Amnber nie istnieje");
		List<String> listaPiwBursztonowychEnOk = mapa.get("Amber");
		if(listaPiwBursztonowychEnOk==null)System.out.println("Bład");
		listaPiwBursztonowychEnOk.forEach(e->System.out.println(e));
		mapa.forEach((k,v)->{
			System.out.println("Dla klucza "+k+" istnieją następujące wartości :");
			v.forEach(e-> System.out.println(e));
			
		});
		List<String> default1 = mapa.getOrDefault("Różowe", new ArrayList<>(Arrays.asList("Okocim 0% malinowe", "Piwo dla kobiet")));
		System.out.println(default1);
		List<String> default2 = mapa.getOrDefault(klucz1en, new ArrayList<>(Arrays.asList("Okocim 0% malinowe", "Piwo dla kobiet")));
		System.out.println(default2);
		System.out.println(new HashMap<>().isEmpty());
		System.out.println(mapa.isEmpty());
		Set<String> keySet = mapa.keySet();
		keySet.forEach(k-> System.out.println(k));
		Collection<List<String>> values = mapa.values();
		values.forEach(e->{
			e.forEach(markaPiwa-> System.out.println(markaPiwa));
		});
		Set<Entry<String, List<String>>> entrySet = mapa.entrySet();
		for(Entry<String, List<String>> entry : entrySet) {
			String key = entry.getKey();
			List<String> value = entry.getValue();
			System.out.println("dla klucza "+key+ " przypadają następujące marki piwa "+value.toString());
		}
		System.out.println(mapa.containsKey("Jasne"));
		System.out.println(mapa.containsKey("jasne"));
		System.out.println(mapa.containsKey("JasnE"));
		System.out.println(mapa.containsKey(Color.black));
		System.out.println(mapa.containsValue("Jasne"));
		System.out.println(mapa.containsValue(piwaJasne));
		System.out.println(mapa.containsValue(new ArrayList<>(Arrays.asList("Porter","Palone","Fortuna", "Namysłów"))));
		HashMap<String, List<String>> drugaMapa = new HashMap<>();
		drugaMapa.put("Najjaśniejsze", new ArrayList<>(Arrays.asList("Lech", "Okocim", "Desperados")));
		drugaMapa.put("Jasne", new ArrayList<>(Arrays.asList("Bosman", "Sikora", "Perła Export")));
		mapa.putAll(drugaMapa);
		mapa.forEach((k,v)->{
			System.out.println("dla klucza "+k+" po złączeniu mamy wartości "+v);
		});
	}

}
