package pl.ograniczenia;

public class OgraniczeniaMain {

	public static void main(String[] args) {
		Integer[] tablicaLiczbCalkowitych = {1, 2, 7, 9, 12,18,22};
		Double[] tablicaLiczbRzeczywistych = {2.25, 8D,7.99, 17D, 19.82, 23.88};
		Statystyka<Integer> calkowite = new Statystyka<Integer>(tablicaLiczbCalkowitych);
		Statystyka<Double> rzeczywiste = new Statystyka<Double>(tablicaLiczbRzeczywistych);
		System.out.println("średnia z liczb całkowitych "+calkowite.obliczSrednia());
		System.out.println("średnia z liczb rzeczywistych "+rzeczywiste.obliczSrednia());
		//String [] tab = {"1", "2",  "3", "4"};
		//Statystyka<String> blad = new Statystyka<String>(tab) ;
//		
//		Integer[] tablicaLiczbCalkowitych2 = {77, 2, 149, 1299, 12,18,22};
//		Statystyka<Integer> calkowite2 = new Statystyka<Integer>(tablicaLiczbCalkowitych2);
		boolean czySredniaJestIdentyczna = calkowite.czySredniaJestIdentyczna(rzeczywiste);
		System.out.println(czySredniaJestIdentyczna ? "Tak" : "Nie");
//		boolean srednia = calkowite.czySredniaJestIdentyczna(calkowite2);
//		System.out.println(srednia);

	}

}
