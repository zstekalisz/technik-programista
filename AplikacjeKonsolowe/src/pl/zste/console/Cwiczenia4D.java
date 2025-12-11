package pl.zste.console;

public class Cwiczenia4D {
	
	public static void main(String[] args) {
		
	}
	
	public static int policzSamogloski(String tekst) {
		if(tekst==null || tekst.isEmpty()) {
			return 0;
		}
		String wzorzec = "aąeęiouóyAĄEĘIOUÓY";
		String[] wzorzecTablica = wzorzec.split("");
		String[] tekstTablica = tekst.split("");
		int licznik =0;
		for(int i = 0; i< tekstTablica.length; i++) {
			String znak = tekstTablica[i];
			for(int j =0; j< wzorzecTablica.length; j++) {
				if(znak.equals(wzorzecTablica[j])) {
					licznik++;
				}
			}
		}
		return licznik;
		
	}
	
	public static String usunPowtorzenia(String tekst) {
		String[] tablica = tekst.split("");
		StringBuilder b = new StringBuilder();
		for(int i = 0; i<tablica.length; i++) {
			if(!tablica[i].equals(tablica[i+1])) {
				b.append(tablica[i]);
			}
		}
		return b.toString();
	}

}
