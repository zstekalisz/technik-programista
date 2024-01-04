package pl.zste.list.cwiczenia.gr2;

import java.util.ArrayList;
import java.util.List;

public class MainCwiczenia {

	public static void main(String[] args) {
		Telefon samsS24 = new Telefon("Samsung", "S24", 6.2, 4999.99);
		Telefon iph15 = new Telefon("Iphone", "15", 6.2, 4499.99);
		Telefon nokia = new Telefon("Nokia", "6310", 1.5 , 999.00);
		Telefon chnPhone = new Telefon("Xioaomi", "13Pro", 6.2, 3999.99);
		List<Telefon> telefony = new ArrayList<Telefon>();
		telefony.add(samsS24);// obiekt jest na indeksie 0
		telefony.add(0, iph15);// obiekt zajmie indeks 0 a reszta kolekcji przesunie się o 1 indeks do przodu
		telefony.add(nokia);
		System.out.println(telefony);
		telefony.sort(Telefon.porownaniePoCenie.reversed());
		System.out.println(telefony);
		telefony.sort(Telefon.porownaniePoMarce);
		System.out.println(telefony);
		telefony.add(1,chnPhone);
		System.out.println(telefony);
		telefony.sort(Telefon.porownaniePoMarce);
		System.out.println(telefony);
	}

}
